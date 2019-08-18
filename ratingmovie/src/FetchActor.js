import { Component } from 'react';
import React from 'react';
import { Form, FormGroup, FormControl, Button, ListGroup, ListGroupItem } from 'react-bootstrap';



class FetchActor extends Component {
    constructor(props) {
        super();
        this.state = {
            actorid:"",
            actorname:"",
            dob:"",
            bio:"",
            sex:"",
            movie:"",
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
                    <FormControl type="number" name="actorid" placeholder="Enter actor id" onBlur={this.changeText} /> <br />
                    <Button onClick={this.clickme}>Fetch Actor</Button>
                    </FormGroup></Form>) :
                <Form><FormGroup>
                    <ListGroup> Actor Fetched Successfully. <br />
                   <ListGroupItem> Actor Name: {this.state.responseObject.actorname}</ListGroupItem>
                    <ListGroupItem>Date Of Birth : {this.state.responseObject.dob}</ListGroupItem>
                    <ListGroupItem>Biography : {this.state.responseObject.bio}</ListGroupItem>
                    <ListGroupItem>Sex : {this.state.responseObject.sex}</ListGroupItem> 
                    <ListGroupItem>Movie : {this.state.responseObject.movie}</ListGroupItem>                 
                    </ListGroup>
                    </FormGroup>
                    </Form>}
        </div>

        );

    }

   
    changeText(event) {
        this.setState({ [event.target.name]: event.target.value });
    }
    fetchMovie() {
        fetch('http://localhost:8080/fetchActorById', {
            method: 'POST',
            body: JSON.stringify(
                
                 this.state.actorid
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
export default FetchActor;