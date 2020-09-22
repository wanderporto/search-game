import React from 'react'
import { Text, StyleSheet, View } from 'react-native'
import Header from '../../components/Header';

const CreateRecord = () => {
    return (
        <View>
            <Header />
            <Text style={styles.text}> hello Create Record </Text>
        </View>
    );
}
const styles = StyleSheet.create({
    text: {
        color: '#FFF',
        fontSize: 50,
        textAlign: "center",
        marginTop: 100
    }
}
);
export default CreateRecord;