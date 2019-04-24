package main

import "fmt"

const (
	TWO_WHEELER  = "Two wheeler vehicle"
	FOUR_WHEELER = "Four wheeler vehicle"
)

type vehicle interface {
	printVehicle()
}

type fourWheeler struct {
}
func (fw fourWheeler) printVehicle() {
	fmt.Println("I am four wheeeler")
}

type twoWheeler struct {
}
func (tw twoWheeler) printVehicle() {
	fmt.Println("I am two wheeler")
}

// Either this, i.e. using class factory
type vehicleFactory struct {
}
func (vf vehicleFactory) NewVehicle(typeOfVehicle string) vehicle {
	if typeOfVehicle == TWO_WHEELER {
		return &twoWheeler{}
	} else if typeOfVehicle == FOUR_WHEELER {
		return &fourWheeler{}
	} else {
		return nil
	}
}

// or this, i.e. using factory method
func CreateVeichle(typeOfVehicle string) vehicle {
	if typeOfVehicle == TWO_WHEELER {
		return &twoWheeler{}
	} else if typeOfVehicle == FOUR_WHEELER {
		return &fourWheeler{}
	} else {
		return nil
	}
}

func main() {
	// EITHER THIS
	// creating object via class factory
	ourFactory := vehicleFactory{};

	// create a four wheeler vehicle using factory CLASS
	fourWheelerVehicle := ourFactory.NewVehicle(FOUR_WHEELER);
	fourWheelerVehicle.printVehicle()

	// create a two wheeler vehicle using factory CLASS
	twoWheelerVehicle := ourFactory.NewVehicle(TWO_WHEELER);
	twoWheelerVehicle.printVehicle()

	// OR THIS
	// create a four wheeler vehicle using factory METHOD
	fourWheelerVehicle = CreateVeichle(FOUR_WHEELER);
	fourWheelerVehicle.printVehicle()

	// create a two wheeler vehicle using factory METHOD
	twoWheelerVehicle = CreateVeichle(TWO_WHEELER);
	twoWheelerVehicle.printVehicle()
}
