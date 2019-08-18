import { Component } from 'react';
import React from 'react';

import DayPicker from 'react-day-picker';
import 'react-day-picker/lib/style.css';
import { FormGroup, Form, FormControl, FormLabel, Button, ListGroup, ListGroupItem, FormCheck } from 'react-bootstrap';


class Actor extends Component {
    constructor(props) {
        super();
        this.state = {
           actorname:"",
           dob:"",
           bio:"",
           sex:"",
           mid:"",
            responseObject: "",
            result: false
        }

        this.clickme = this.createActor.bind(this);
        this.changeText = this.changeText.bind(this);
  
    }
   
    render() {
        return (<div>
            {(!this.state.result) ? (
                <Form>
                    <FormGroup>
                    <FormLabel>Actor Name:</FormLabel>
                    <FormControl type="text" name="actorname" placeholder="enter actor name" onBlur={this.changeText} /> <br />
                   </FormGroup>
                   <FormGroup>
                   <FormLabel>Biography:</FormLabel><br/>
                    <FormControl as="textarea" name="bio" placeholder="Biography" onBlur={this.changeText} /> <br />
                    </FormGroup>
                    <FormGroup>
                    <FormLabel>Date Of Birth:</FormLabel>
                    <FormControl type="string" name="dob" placeholder="dd/mm/yyyy" onBlur={this.changeText}/>
                    </FormGroup>
                    <FormGroup>
                    <div onChange={this.changeText}><FormLabel>Sex:</FormLabel><br/>
                      <FormCheck type="radio" value="MALE" name="sex"/> Male<br/>
                      <FormCheck type="radio" value="FEMALE" name="sex"/> Female
                    </div>
                    </FormGroup>
                    <FormGroup>
                        <FormLabel>Choose the Movie Id</FormLabel>
                        <Form.Control as="select" multiple  placeholder="Enter movie id" name="mid" onBlur={this.changeText}>
                         <option>1</option>
                         <option>2</option>
                         <option>3</option>
                         <option>4</option>
                         <option>5</option>
                        </Form.Control><br/>
                    </FormGroup>
                    <Button onClick={this.clickme}> Add Actor</Button></Form>) :
                <Form><FormGroup>
                    <ListGroup>
                    <FormLabel>Actor Added Successfully.</FormLabel>
                   <ListGroupItem> Actor Name: {this.state.actorname}</ListGroupItem>
                    <ListGroupItem>Date Of Birth : {this.state.dob}</ListGroupItem>
                    <ListGroupItem>Biography : {this.state.bio}</ListGroupItem>
                    <ListGroupItem>Sex : {this.state.sex}</ListGroupItem>
                    </ListGroup>
                    </FormGroup>
                    </Form>}
        </div>

        );

    }

   

    changeText(event) {
        this.setState({ [event.target.name]: event.target.value });
    }
    createActor() {
        fetch('http://localhost:8080/createActor', {
            method: 'POST',
            body: JSON.stringify({
               
               
                actorname: this.state.actorname,
                dob: this.state.dob,
                sex: this.state.sex,
                bio:this.state.bio,
                movieid:this.state.mid
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


export default Actor;