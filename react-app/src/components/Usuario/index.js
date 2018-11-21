import React from 'react';
import UsuarioShow from "./usuarioShow";
import UsuarioForm from "./usuarioForm";
import {fetchUsuario} from "../../actions/usuarioAction";
import {connect} from "react-redux";
import {VIEW_USER} from "../../actions/actionTypes";


class Usuario extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            users: []
        }
    }

    componentDidMount() {

        this.props.fetchUsuario();
    }

    componentWillReceiveProps(nextProps) {

        if (nextProps.actionType === VIEW_USER) {
            this.setState({users: nextProps.usuarioList});
        }
    }

    render() {

        return (
            <div>
                <UsuarioShow users={this.state.users}/>


            </div>
        )
    }
}

const mapState = state => {
    return {
        usuarioList: state.usuario.usuarioList ,
        actionType: state.usuario.actionType
    }
};

const mapDispatch = {
    fetchUsuario
};

export default connect(mapState, mapDispatch)(Usuario);