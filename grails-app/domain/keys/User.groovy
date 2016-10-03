package keys

class User {

    static belongsTo = [Customer]
    static hasMany = [managedCustomers: Customer]

}
