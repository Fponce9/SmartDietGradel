import React,{Component} from 'react';
import {Link} from 'react-router-dom';
import {Button, Form, Table,NavItem} from 'react-bootstrap';
import PropTypes from "prop-types";
import Calendar from 'react-calendar';
import {fetchFoodfecha} from "../../actions/foodActions";
import connect from "react-redux/es/connect/connect";
import {fetchExerciseList} from "../../actions/exerciseActions";

class ExerciseList extends React.Component {

    static propTypes = {
        exercises: PropTypes.array.isRequired
    };

    constructor(props) {

        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.state = {
            exercises: [],
            fecha: '2018-11-17',
        };
    }



    componentWillReceiveProps(nextProps) {

        if (nextProps.exercises) {
            this.setState({exercises: nextProps.exercises})
        }
    }

    handleChange(event) {

        let Month =event.getMonth()+1;
        let Day =event.getDate();
        let Year =event.getFullYear();
        let fieldValue =Year+"-"+Month+"-"+Day;
        console.log(fieldValue);
        this.props.fetchExerciseList(fieldValue);
        this.setState({...this.state, fecha: fieldValue})

    }

    render() {

        return (

            <div>
            <br/>
                <h4>Lista de ejercicios registradas :  </h4>

                <Calendar
                    onChange={this.handleChange.bind(this)}
                />
                <Table responsive hover>
                    <thead>
                    <tr>


                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Rutinas</th>
                        <th>Puntaje</th>
                    </tr>
                    </thead>
                    <tbody>

                    {this.state.exercises.map((exercise, index) => (
                        <tr key={index}>
                            <td>{exercise.idpdejercicio}</td>
                            <td>{exercise.nombre}</td>
                            <td>{exercise.descripcion}</td>
                            <td>{exercise.rutinas}</td>
                            <td>{exercise.puntaje}</td>
                        </tr>
                    ))}
                    </tbody>
                </Table>

            </div>

        )
    }
}

const mapState = state => {
    return {
        exerciseList: state.exercise.exerciseList ,
        actionType: state.exercise.actionType
    }
};

const mapDispatch = {
    fetchExerciseList
};

export default connect(mapState, mapDispatch)(ExerciseList);