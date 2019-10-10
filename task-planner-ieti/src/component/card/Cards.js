import React from 'react';
import { Todo } from './Todo'
import './Cards.css'

import Card from "@material-ui/core/Card";
import CardActionArea from "@material-ui/core/CardActionArea";
import Typography from "@material-ui/core/Typography";
import CardContent from "@material-ui/core/CardContent";
import uuid from "uuid";


export class Cards extends React.Component {
  


    render() {
        const listTodo = this.props.tdList.map((td) =>
            <div key = {uuid.v4()}>
                 <Card>
                    <CardActionArea>
                        <Todo text={td.text} email={td.email} dueDate={td.dueDate} status = {td.status}/>
                    </CardActionArea>
                </Card>
                <br></br>
            </div>

        );
        return (
            <ul>{listTodo}</ul>

        );
    }


}