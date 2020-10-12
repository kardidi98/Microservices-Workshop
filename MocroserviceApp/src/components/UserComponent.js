import React from 'react';
import { Card, Table} from 'react-bootstrap';
import axios from 'axios';
import {Link} from 'react-router-dom'


class users extends React.Component {
    constructor(props){
        super(props);
        this.state={
            users:[]
        }
    }
    componentDidMount(){
        this.findAllUsers(); 
    }

    

    findAllUsers(){
        
        //http://localhost:8087/users/
        axios.get("https://randomapi.com/api/6de6abfedb24f889e0b5f675edc50deb?fmt=raw&sole")
        .then(response =>  {
            this.setState({users:response.data});
            
        }); 
        
    };


    render() {
        
        return (
            <div>
                
            <Card className="text-white bg-dark border border-dark">
                <Card.Header>
                    Users List
                </Card.Header>
                <Card.Body>
                    <Table bordered hover striped variant="dark">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>name</th>
                                <th>Rated Movies</th>
                            </tr>
                        </thead>
                        <tbody>
                         {
                             
                            this.state.users.length===0 ? 
                            <tr align="center">
                                <td colSpan="3"> No User</td>
                                
                            </tr> : 
                            this.state.users.map((user,index) => 
                                 <tr key={index}>
                                     <td>
                                        {index + 1}
                                    </td>
                                    <td>
                                        {user.first}
                                    </td>
                                    <td>
                                       <Link to={"/catalog/"+(index + 1)}>
                                           View Rated movies
                                       </Link>
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

export default users;