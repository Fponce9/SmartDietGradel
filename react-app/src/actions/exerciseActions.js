import {VIEW_EXERCISE_LIST, VIEW_FOODS_FECHA} from './actionTypes';

export function fetchExerciseList(fecha) {


    return function (dispatch, getState) {

        let puntaje=0;
        let count=0;
        fetch("http://localhost:9090/SmartDiet/Alimento/fecha/"+fecha)

            .then(response => response.json())

            .then(jsonData => {
                jsonData.map((data)=>{

                    puntaje=puntaje+data.datoAlimento.carbohidratos;
                    count=count+1;
                });
                if(count===0){
                    puntaje=0;
                }else {
                    puntaje=puntaje/count;
                }
                fetch("http://localhost:9090/SmartDiet/Ejercicio/puntaje/"+puntaje)

                    .then(response => response.json())

                    .then(jsonData => {
                        dispatch(setExerciseList(jsonData))
                    })


            })


};


}

function setExerciseList(exerciseList) {

    return {
        type: VIEW_EXERCISE_LIST,
        exerciseList: exerciseList
    }
}
