import { Component } from 'react';
import React from 'react';
import { Button, FormGroup, FormLabel, FormControl, Form, ListGroup, ListGroupItem } from 'react-bootstrap';

class Movie extends Component {
    constructor(props) {
        super();
        this.state = {
           moviename:"",
           yor:"",
           plot:"",
           aid:"",
            responseObject: "",
            result: false
        }

        this.clickme = this.createMovie.bind(this);
        this.changeText = this.changeText.bind(this);
    }
    render() {
        return (<div>
            {(!this.state.result) ? (
                <Form>
                    <FormGroup  controlId="moviename">
                    <FormLabel>Movie Name:</FormLabel>
                    <FormControl type="text" name="moviename" placeholder="enter movie name" onBlur={this.changeText} /> 
                    </FormGroup><br />
                    <FormGroup>
                    <FormLabel>Year Of Release:</FormLabel>
                    <FormControl type="number" name="yor" placeholder="Enter year of release" onBlur={this.changeText} /> <br />
                    </FormGroup>
                    <FormGroup>
                    <FormLabel>Movie Description:</FormLabel>
                    <FormControl as="textarea" name="plot" placeholder="Movie description" onBlur={this.changeText} /> <br />
                    </FormGroup>
                    <FormGroup>
                    <FormLabel>Actor Id:</FormLabel>
                    <FormControl type="number"  placeholder="Enter actor id" name="aid" onBlur={this.changeText}/><br/>
                    </FormGroup>
                    <Button variant ="primary" onClick={this.clickme}> Add Movie</Button></Form>) :
                <Form><FormGroup><ListGroup>
                   <ListGroupItem> Movie Added Successfully. </ListGroupItem>
                  <ListGroupItem>  Movie Name: {this.state.moviename} </ListGroupItem>
                   <ListGroupItem> Year Of Release : {this.state.yor}</ListGroupItem>
                   <ListGroupItem> Plot : {this.state.plot}</ListGroupItem>
                    </ListGroup>
                </FormGroup>
                </Form>}
        </div>

        );

    }

    // This should change the state values before submitted to rest api
    changeText(event) {
        this.setState({ [event.target.name]: event.target.value });
    }
    createMovie() {
        fetch('http://localhost:8080/createMovies', {
            method: 'POST',
            body: JSON.stringify({
               
               
                moviename: this.state.moviename,
                yor: this.state.yor,
                plot: this.state.plot,
                actorid:this.state.aid
            }),
            headers: {
                "Content-type": "application/json; charset=UTF-8"
            }
        })
            .then(res => res.json())
            .then((data) => {
                this.setState({ responseObject: data });
                this.setState({ result: true });
            })
            .catch(console.log)
        this.setState({ result: true });
    }
}


export default Movie;