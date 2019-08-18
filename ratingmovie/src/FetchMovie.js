import { Component } from 'react';
import React from 'react';
import { Form, FormControl, Button, FormGroup, ListGroup, ListGroupItem } from 'react-bootstrap';



class FetchMovie extends Component {
    constructor(props) {
        super();
        this.state = {
            movieid:"",
            moviename:"",
            yor:"",
            plot:"",
            
            responseObject: "",
            result: false
        }
        this.clickme = this.fetchMovie.bind(this);
        this.changeText = this.changeText.bind(this);
    }
    render() {
        return (<div>
            {(!this.state.result) ? (
                <Form>
                    <FormGroup>
                    <FormControl type="number" name="movieid" placeholder="Enter movie id" onBlur={this.changeText} /> <br />
                    <Button onClick={this.clickme}>Fetch Movie</Button>
                    </FormGroup>
                </Form>) :
                <Form> 
                    <FormGroup><ListGroup>
                    <ListGroupItem>Movie Fetched Successfully. </ListGroupItem>
                    <ListGroupItem>Movie Name: {this.state.responseObject.moviename}</ListGroupItem>
                    <ListGroupItem>Year Of Release : {this.state.responseObject.yor}</ListGroupItem>
                    <ListGroupItem>Plot : {this.state.responseObject.plot}</ListGroupItem>
                    </ListGroup></FormGroup>
                    </Form>}
        </div>

        );

    }

   
    changeText(event) {
        this.setState({ [event.target.name]: event.target.value });
    }
    fetchMovie() {
        fetch('http://localhost:8080/fetchMoviesById', {
            method: 'POST',
            body: JSON.stringify(
                
                 this.state.movieid
            ),
            headers: {
                "Content-type": "application/json; charset=UTF-8"
            }
        })
            .then(res =>{return res.json();})
            .then((data) => {
                this.setState({ responseObject: data });
                this.setState({ result: true });
            })
            .catch(console.log)
        this.setState({ result: true });
    }
}
export default FetchMovie;