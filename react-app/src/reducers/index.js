import {combineReducers} from 'redux';
import food from './food';
import exercise from './exercise';
import usuario from './usuario'

export default combineReducers({
    exercise, food, usuario
});
