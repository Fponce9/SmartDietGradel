import React,{Component} from 'react';
import {Link} from 'react-router-dom';
import {Jumbotron,Grid,Row,Col,Image,Button,Navbar,NavDropdown,MenuItem,NavItem,Nav,Carousel,Thumbnail} from 'react-bootstrap';
import './index.css'
import burrito from './burrito.jpg';
import burrito2 from './beef.jpg';
import burrito3 from './basil.jpg';
import carnes from './carnes.jpg';
import food from './do.jpg';
import ensalada from './ensalada.jpg';
import pizza from './pizza.jpg';
import food2 from './food2.jpg';


class Dashboard extends React.Component {

    render() {
        return (


            <Grid>


                <Carousel>
                  <Carousel.Item>
                    <img width={1500} height={500}  src={burrito} />
                    <Carousel.Caption>
                      <h3>First slide label</h3>
                      <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                    </Carousel.Caption>
                  </Carousel.Item>
                  <Carousel.Item>
                    <img width={1500} height={500}  src={burrito2} />
                    <Carousel.Caption>
                      <h3>Second slide label</h3>
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    </Carousel.Caption>
                  </Carousel.Item>
                  <Carousel.Item>
                    <img width={1500} height={500}  src={burrito3}/>
                    <Carousel.Caption>
                      <h3>Third slide label</h3>
                      <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                    </Carousel.Caption>
                  </Carousel.Item>
                </Carousel>
    <br/>
                <Row className="show-grid text-center">
                <Col lg={4} md={0} lgPull={0}>
                <br/>
                <Thumbnail  alt="500x200" src={pizza}  className="profile-pic"/>


                </Col>
                <Col lg={4} md={0} lgPull={0} >
                                <br/>
                                <Thumbnail  src={carnes} alt="500x200" className="profile-pic"/>

                                </Col>
                 <Col lg={4} md={0} lgPull={0} >
                                                <br/>
                                                <Thumbnail  src={pizza}  alt="500x200" className="profile-pic"/>


                  </Col>

                </Row>

            </Grid>






        )
    }
}

export default Dashboard;