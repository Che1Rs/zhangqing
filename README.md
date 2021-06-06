**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
void save(char* digits, char** map, char* before, int len, int start, char*** result, int* size) {
    if(start == len) {
        (*size)++;
        result[0] = (char**)realloc(result[0], *size * sizeof(char*));
        result[0][*size - 1] = (char*)malloc((len + 1) * sizeof(char));
        memcpy(result[0][*size - 1], before, len * sizeof(char));
        result[0][*size - 1][len] = '\0';
        return;
    }
    char* temp = map[digits[start] - '1'];
    while(*temp) {
        before[start] = *temp;
        save(digits, map, before, len, 1 + start, result, size);
        temp++;
    }
}
char** letterCombinations(char* digits, int* returnSize) {
    int len = strlen(digits);
    if(len == 0)
        return NULL;
    char* map[9] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    char** result = NULL;
    char* before = (char*)malloc(len * sizeof(char));
    save(digits, map, before, len, 0, &result, returnSize);
    return result;
}

