//Sắp xếp rất nhanh đối với danh sách gần được sắp xếp
const arr = [6, 5, 3, 8, 1, 2]

function insertionSort(arr){
    let length = arr.length
    for(let i = 0; i < length; i++){
        for(let j = i + 1; j < length; j++){
            if(arr[j] < arr[i]){
                let temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
            }
        }
    }
}