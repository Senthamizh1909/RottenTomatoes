import React, {Component} from 'react';
import Modal from 'react-modal';
export default class FetchAll extends Component {
    constructor(props) {
        super(props)
        this.state = {
            movies: []
        }
    }

    componentDidMount() {
        let self = this;
        fetch('http://localhost:8080/fetchAllMovies', {
            method: 'POST'
        }).then(function(response) {
            if (response.status >= 400) {
                throw new Error("Bad response from server");
            }
            return response.json();
        }).then(function(data) {
            self.setState({movies: data});
        }).catch(err => {
        console.log('caught it!',err);
        })
        
    }
    render() {
        return (
        <div className="container"> 
            <div className="panel panel-default p50 uth-panel">
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th>Movie name</th>
                            <th>Year Of Release</th>
                            <th>Description</th>
                            <th>Actor Id</th>
    
                        </tr>
                    </thead>
                    <tbody>
                    {this.state.movies.map(movie =>
                        <tr key={movie.movieid}>
                        <td>{movie.moviename} </td>
                        <td>{movie.yor}</td>
                        <td>{movie.plot}</td>
                        
                      
                        </tr>
                    )}
                    </tbody>
                </table>
            </div>
        </div>
        );
    }
}