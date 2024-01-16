// 10 -> 5 -> 16
let myLinkedLists = {
    head: {
        value: 10,
        next: {
            value: 5,
            next: {
                value: 16,
                next: null
            }
        }
    }
}

//SINGLY LINKED LIST
class Node {
    constructor(value) {
        this.value = value;
        this.next = null
    }
}

class LinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: null
        }
        this.tail = this.head;
        this.length = 1;
    }

    append(value) {
        let newNode = new Node(value)
        this.tail.next = newNode
        this.tail = newNode
        this.length++
        return this

    }

    prepend(value) {
        let newNode = new Node(value)
        newNode.next = this.head
        this.head = newNode
        this.length++
        return this
    }

    printList() {
        const arr = [];
        let currendNode = this.head;
        while (currendNode !== null) {
            arr.push(currendNode.value)
            currendNode = currendNode.next
        }
        return arr
    }

    insert(index, value) {
        if (index >= this.length) {
            return append(value)
        }
        let newNode = new Node(value)
        let leader = this.traverseToIndex(index - 1)
        const hol = leader.next
        leader.next = newNode
        newNode.next = hol
        this.length++
        return this
    }

    traverseToIndex(index) {
        let point = 0
        let currendNode = this.head
        while (point != index) {
            currendNode = currendNode.next
            point++
        }
        return currendNode
    }

    remove(index) {
        if(index === 0){
            const hol = this.head.next
            this.head = hol
        }else if(index === this.length){
            const leader = this.traverseToIndex(index - 2)
            this.tail = leader
            this.tail.next = null
        }else{
            let leader = this.traverseToIndex(index - 1)
            let hol = leader.next 
            leader.next =  hol.next 
    
        }
    }

    reverse() {
        
    }


}

const myLink = new LinkedList(1)
// myLink.prepend(2)
// myLink.prepend(3)
myLink.append(2)
myLink.append(3)
myLink.insert(2, 5)
myLink.remove(4)

console.log(myLink.printList())

// myLink.append(3)
// myLink.append(4)
// myLink.append(5)
// myLink.reverse()
// console.log(myLink.printList())




