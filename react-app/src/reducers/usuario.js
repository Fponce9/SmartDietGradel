import {CREATE_USER,VIEW_USER} from '../actions/actionTypes';

export default function usuario(state = {}, action) {
    switch (action.type) {
        case VIEW_USER:
            return Object.assign({}, state, {
                actionType: action.type,
                usuarioList: action.usuarioList,
                error: false
            });

        case CREATE_USER:
            return Object.assign({}, state, {
                actionType: action.type,
                createResult: action.createResult,
                error: false
            })
        default:
            return state;
    }
}