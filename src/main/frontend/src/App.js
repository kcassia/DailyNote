import React, {Component} from 'react';
import User from "./components/User";
import './App.css';
import Paper from '@material-ui/core/Paper'
import Table from '@material-ui/core/Table';
import TableHead from '@material-ui/core/TableHead';
import TableBody from '@material-ui/core/TableBody';
import TableRow from '@material-ui/core/TableRow';
import TableCell from '@material-ui/core/TableCell';
import {withStyles} from "@material-ui/core/styles";

const styles = theme => ({
    root: {
        width: '100%',
        marginTop: theme.spacing.unit * 3,
        overflowX: "auto"
    },
    table: {
        minWidth: 1000
    }
})

const users = [
    {
        'id': 1,
        'image': 'https://placeimg.com/64/64/1',
        'name': '오제욱',
        'birthday': '910701',
        'gender': '남자',
        'job': '직장인'
    },
    {
        'id': 2,
        'image': 'https://placeimg.com/64/64/2',
        'name': '가제욱',
        'birthday': '910702',
        'gender': '여자',
        'job': '백수'
    },
    {
        'id': 3,
        'image': 'https://placeimg.com/64/64/3',
        'name': '나제욱',
        'birthday': '910703',
        'gender': '남자',
        'job': '학생'
    }
]

class App extends Component {
    render() {
        const {classes} = this.props;
        return (
            <Paper className={classes.root}>
                <Table className={classes.table}>
                    <TableHead>
                        <TableRow>
                            <TableCell>번호</TableCell>
                            <TableCell>이미지</TableCell>
                            <TableCell>이름</TableCell>
                            <TableCell>생년월일</TableCell>
                            <TableCell>성별</TableCell>
                            <TableCell>직업</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {
                            users.map(u => {
                                return (
                                    <User
                                        key={u.id}
                                        id={u.id}
                                        image={u.image}
                                        name={u.name}
                                        birthday={u.birthday}
                                        gender={u.gender}
                                        job={u.job}
                                    />

                                );
                            })
                        }
                    </TableBody>
                </Table>
            </Paper>
        );
    }
}

export default withStyles(styles)(App);
