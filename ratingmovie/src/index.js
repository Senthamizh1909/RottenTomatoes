import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import { Route,NavLink, Link, Switch, BrowserRouter as Router } from 'react-router-dom';
import Movie from './Movie';
import Actor from './Actor';
import FetchMovie from './FetchMovie';
import FetchActor from './FetchActor';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Col, Carousel, CarouselItem, Form, Image, Jumbotron } from 'react-bootstrap';
import CarouselCaption from 'react-bootstrap/CarouselCaption';
import FetchAll from './FetchAll';
//ReactDOM.render(<App />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
const routing = (
    <Router>
            <div className="phase1" style ={ { backgroundImage: "url('https://cdn.wallpapersafari.com/33/28/2xCEre.jpg')" } }>
      <Form>

        
      <Jumbotron>
  <h1>Rotten Potatoes</h1>
 
</Jumbotron>
      </Form>
      </div>
      <div>
      <ul>
        <Container>
          <Row>
          <Col>
      <li>
        <NavLink exact activeClassName="active" to="/">RP</NavLink>
      </li>
      </Col>
            <Col>
      <li>
        <NavLink exact activeClassName="active" to="/addmovie">Add Movie+</NavLink>
      </li>
      </Col>
      <Col>
      <li>
        <NavLink exact activeClassName="active" to="/addactor">Add Actor+</NavLink>
      </li>
      </Col>
      <Col>
      <li>
        <NavLink exact activeClassName="active" to="/fetchmovie">Search Movie</NavLink>
      </li>
      </Col>
      <Col>
      <li>
        <NavLink exact activeClassName="active" to="/fetchactor">Search Actor</NavLink>
      </li>
      </Col>
     
     </Row>
     </Container>

    </ul>
    
   
    <Switch>
        <Route path="/" exact component={FetchAll} />
        <Route path="/addmovie" exact component={Movie} />
        <Route path="/addactor" exact component={Actor} />
        <Route path="/fetchmovie" exact component={FetchMovie} />
        <Route path="/fetchactor" exact component={FetchActor} />
    </Switch>
    
      </div>
      

     
      <footer>
        <Form>
          <Jumbotron>
            <p>Help<br/>
               Send Feedback<br/>
               Contact<br/>
               Privacy<br/>
               Terms<br/>
            </p>
          </Jumbotron>
                  </Form>
                  </footer>
    </Router>
    
  )
  ReactDOM.render(routing, document.getElementById('root'));
