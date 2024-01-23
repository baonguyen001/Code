//Linked List
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    constructor() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    peek() {
        return this.top.value
    }

    push(value) {
        const newNode = new Node(value)
        if(this.bottom === null){
            this.top = newNode
            this.bottom = newNode
        }else{
            const hol = this.top
            this.top = newNode
            this.top.next = hol
        }
        this.length++
    }

    pop() {
        if(!this.top){
            return null
        }
       const hol = this.top.next
       console.log(this.top.value)
       this.top = hol
       if(this.bottom === this.top){
        this.bottom = null
       }
       this.length -- 
    }
}

const myStack = new Stack();
myStack.push('Google');
myStack.push('Udemy.com');
console.log(myStack)
console.log(myStack.peek())
myStack.pop()
myStack.pop()
console.log(myStack)

//=============== Array =====================
class Stack {
    constructor() {
        this.array = []
    }

    peek() {
        return this.array[this.array.length - 1]
    }

    push(value) {
        this.array.push(value)
    }

    pop() {
      this.array.pop()
      return this
    }
}

// const myStack = new Stack();
// myStack.push('Google');
// myStack.push('Udemy.com');
// // console.log(myStack)
// // console.log(myStack.peek())
// // myStack.pop()
// myStack.pop()
// console.log(myStack)



