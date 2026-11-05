resource = {
    "milk": 100,
    "water": 200,
    "coffee": 300
}
profit = 0
MENU = {
    "latte" : {
        "ingredients": {
        "water": 30,
        "milk": 10,
        "coffee": 5
        },
        "price": 0.75
    },
    "expresso": {
        "ingredients": {
            "water": 10,
            "milk": 5,
            "coffee": 2
        },
        "price":1.25
    },
    "capuchino": {
        "ingredients": {
            "water": 10,
            "milk": 6,
            "coffee": 3
        },
        "price":1.5
    }

}
is_on = True
while is_on:
    choice = input("What would you like to order latte/capuchino/expresso: ")
    if choice == "off":
        break
    elif choice == "report":
        print(f"milk: {resource['milk']}")
        print(f"water: {resource['water']}")
        print(f"coffee: {resource['coffee']}")
        print(f"profit: {profit}")
    else:
        drink = MENU[choice]
        print(drink)

