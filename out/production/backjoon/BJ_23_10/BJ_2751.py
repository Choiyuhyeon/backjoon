#합병정렬 문제

def mergeSort(A):
    if len(A)<=1:
        return A
    left=mergeSort(A[:len(A)//2])
    right=mergeSort(A[len(A)//2:])
    i,j,k = 0, 0, 0
    while i<len(left) and j<len(right):
        if left[i]<right[j]:
            A[k]=left[i]
            i+=1
        else :
            A[k]=right[j]
            j+=1
        k+=1
    if i==len(left): #left의 원소를 모두 사용 했으나 right가 남아 있을 경우 #
        while j<len(right):
            A[k]=right[j]
            j+=1
            k+=1
    elif j==len(right): #right의 원소를 모두 사용 했으나 left가 남아 있을 경우 #
        while i<len(left):
            A[k]=left[i]
            i+=1
            k+=1
    return A

number=list()
a=int(input("숫자의 수를 입력하세요."))
for i in range (a):
    b=int(input(str(a)+"개의 숫자를 입력하세요."))
    number.append(b)
print("정렬전 " + number)
print("정렬 후 " + mergeSort(number))