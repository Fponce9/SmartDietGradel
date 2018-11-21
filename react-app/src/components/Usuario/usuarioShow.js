import React,{Component} from 'react';
import {Link} from 'react-router-dom';
import {Button, Form, Table,NavItem} from 'react-bootstrap';
import PropTypes from "prop-types";

class usuarioShow extends React.Component {

    static propTypes = {
        users: PropTypes.array.isRequired
    };

    constructor(props) {

        super(props);
        this.state = {
            users: [],
        };
    }



    componentWillReceiveProps(nextProps) {

        if (nextProps.users) {
            this.setState({users: nextProps.users})
        }
    }

    render() {
console.log(this.state.users)
        return (

            <div>
                <br/>
                <h4> Usuario </h4>
                <br/>
                <Table responsive hover>
                    <thead>
                    <tr>
                        <th>Peso</th>
                        <th>Altura</th>
                        <th>IMC</th>
                        <th>Edad</th>
                        <th>Actividad Fisica</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.users.map((user, index) => (
                        <tr key={index}>
                            <td>{user.peso}</td>
                            <td>{user.altura}</td>
                            <td>{user.imc}</td>
                            <td>{user.edad}</td>
                            <td>{user.actividadFisicaTotal}</td>

                        </tr>
                    ))}
                    </tbody>

                </Table>
            </div>
        )
    }
}
export default usuarioShow ;