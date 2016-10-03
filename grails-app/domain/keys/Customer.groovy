package keys

class Customer {


    static hasMany = [administrators: User]


    static mapping = {

        administrators cascade: 'none', cache: 'nonstrict-read-write'

    }
}
