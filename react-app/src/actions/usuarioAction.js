import {CREATE_USER} from "./actionTypes";
import {VIEW_USER} from "./actionTypes";

export function createUsuario(request) {
    return function (dispatch, getState){
        fetch("http://localhost:9090/SmartDiet/EstadoFisico",{
            method: 'post',
            headers: {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(request)
        })
            .then(async response=>{
                return Object.assign({}, {error: !response.ok}, await response.json());
            })
            .then(jsonData => {
                dispatch(setCreateUsuarios(jsonData))
            })

    };

}
export function fetchCreateUsuarios(createResult) {
    return {
        type: CREATE_USER,
        createResult
    }
}

export function fetchUsuario(){
    return function (dispatch, getState) {
        fetch("http://localhost:9090/SmartDiet/EstadoFisico")
            .then( response=> response.json())
            .then(jsonData => {
                dispatch(setCreateUsuarios(jsonData))
            })
    }
}

function setCreateUsuarios(usuario){
    return {
        type: VIEW_USER,
        usuarioList: usuario
    }
}
