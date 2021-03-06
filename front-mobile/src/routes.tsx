import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'
import Home from './pages/Home';
import CreatRecord from './pages/CreateRecord';

const Stack = createStackNavigator();

const Router = () => {
    return (
        <NavigationContainer>
            <Stack.Navigator
                headerMode="none"
                screenOptions={{
                    cardStyle: {
                        backgroundColor: '#0B1F34',
                    }
                }}>
                <Stack.Screen name="Home" component={Home} />
                <Stack.Screen name="CreateRecord" component={CreatRecord} />

            </Stack.Navigator>
        </NavigationContainer >
    )
}

export default Router;