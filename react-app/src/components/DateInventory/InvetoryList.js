import React,{Component} from 'react';
import {Link} from 'react-router-dom';
import {Button, Form, Table, NavItem, ControlLabel, FormControl, FormGroup} from 'react-bootstrap';
import PropTypes from "prop-types";
import Calendar from 'react-calendar';
import {fetchFoodfecha} from "../../actions/foodActions";
import connect from "react-redux/es/connect/connect";

class InvetoryList extends React.Component {

    static propTypes = {
        foods: PropTypes.array.isRequired,

    };

    constructor(props) {

        super(props);

        this.handleChange = this.handleChange.bind(this);
        this.state = {
            foods: [],
            fecha: '2018-11-17',
        };

    }


    handleChange(event) {

        let Month =event.getMonth()+1;
        let Day =event.getDate();
        let Year =event.getFullYear();
        let fieldValue =Year+"-"+Month+"-"+Day;
        this.props.fetchFoodfecha(fieldValue);
        this.setState({...this.state, fecha: fieldValue})

    }




    componentWillReceiveProps(nextProps) {


        if (nextProps.foods) {
            this.setState({foods: nextProps.foods})


        }
    }


    render() {

        return (

            <div>
            <br/>
                <h4>Lista de comidas registradas segun fecha :  </h4><br/>

                <FormGroup>
                <Calendar
                    onChange={this.handleChange.bind(this)}
/>
                </FormGroup>




                <Table responsive hover>
                    <thead>
                    <tr>


                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Proteina</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.foods.map((food, index) => (
                        <tr key={index}>
                            <td>{food.datoAlimento.nombre}</td>
                            <td>{food.cantidad}</td>
                            <td>{food.datoAlimento.proteina}</td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
                 <NavItem eventKey={1} componentClass={Link} href="/Food" to="/Food">
                                      Agregar alimentos
                                      </NavItem>


            </div>

        )
    }
}
const mapState = state => {
    return {
        foodDate: state.food.foodDate ,
        actionType: state.food.actionType
    }
};

const mapDispatch = {
    fetchFoodfecha
};

export default connect(mapState, mapDispatch)(InvetoryList);