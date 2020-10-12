import React from 'react';
import NavigationBar from '../src/components/NavigationBar';
import Catalog from '../src/components/CatalogComponent';
import Footer from '../src/components/FooterComponent';
import Welcome from '../src/components/welcome';
import User from '../src/components/UserComponent';
import './App.css';
import { Col, Container, Row } from 'react-bootstrap';
import { Switch, Route, BrowserRouter as Router } from 'react-router-dom'


function App() {
  return (
    <Router>

      <NavigationBar />

        <Container>
          <Row>
            <Col lg={12} style={{marginTop: 50}}>
              <Switch>
                <Route path="/" exact component={Welcome}></Route>
                <Route path="/catalog/:id" exact component={Catalog}></Route>
                <Route path="/users" exact component={User}></Route>
                
              </Switch>
            </Col>

          </Row>
          <Footer />
        </Container>


    </Router>
    
  );
}

export default App;
