function reverseArray(input_array) {
    input_array = input_array || [];
    if (Array.isArray(input_array)) {
        return input_array.reverse();
    }
    return input_array;
}