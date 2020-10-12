import React from 'react';
import { Card, Table} from 'react-bootstrap';
import Rating from '@material-ui/lab/Rating';
import axios from 'axios';

class Catalog extends React.Component {
    constructor(props){
        super(props);
        this.state={
            movies:[]
        }
    }
    componentDidMount(){
        this.findAllMovies(); 
    }

    

    findAllMovies(){
        
        axios.get("http://localhost:8081/catalogs/"+this.props.match.params.id)
        .then(response =>  {
            this.setState({movies:response.data});
            
        }); 
        
    };


    render() {
        
        return (
            <div>
                
            <Card className="text-white bg-dark border border-dark">
                <Card.Header>
                    Catalog Rated Movies
                </Card.Header>
                <Card.Body>
                    <Table bordered hover striped variant="dark">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>nom</th>
                                <th>Desc</th>
                                <th>Rating</th>
                            </tr>
                        </thead>
                        <tbody>
                         {
                             
                            this.state.movies.length===0 ? 
                            <tr align="center">
                                <td colSpan="4"> No Movie Rated</td>
                                
                            </tr> : 
                            this.state.movies.map((movie) => 
                                 <tr key={movie.id}>
                                     <td>
                                        {movie.id}
                                    </td>
                                    <td>
                                        {movie.name}
                                    </td>
                                    <td>
                                        {movie.description}
                                    </td>
                                    
                                    <td>
                                    <Rating
                                       name="simple-controlled"
                                       defaultValue={movie.rating}
                                       size="small"
                                        readOnly
                                        />
                                         
                                    </td>

                                </tr>
                            )
                            
                         }  
                        </tbody>
                    </Table>
                </Card.Body>
            </Card>
            </div>
        )
    }
}

export default Catalog;