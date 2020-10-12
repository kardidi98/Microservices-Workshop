import React from 'react';
import {Navbar, Nav,Form,FormControl,Button} from 'react-bootstrap';
import {Link} from 'react-router-dom'

class NavigationBar extends React.Component {
    render() {
        return (
            <Navbar bg="dark" variant="dark">
                <Link to={""} className="navbar-brand">
                    Movies
                
                </Link>
                <Nav className="mr-auto">
                     <Link to={"/"} className="nav-link">Home</Link> 
                     <Link to={"/users"} className="nav-link">Users</Link>
                     
                </Nav>
                <Form inline>
                    <FormControl type="text" placeholder="Search" className="mr-sm-2" />
                    <Button variant="outline-info">Search</Button>
                </Form>
            </Navbar>
        )
    }

}

export default NavigationBar;