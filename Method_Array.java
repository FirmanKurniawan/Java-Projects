hari = ["senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"]
print("Array: ", hari)

#Menambahkan elemen "senin"
hari.append("senin")
print("Append: ", hari)

#Membuat variable copy lalu menduplikat data dari variable hari
copy = hari.copy()
copy2 = hari
print("Copy: ", copy)
print("Copy2: ", copy2)

#Menghitung banyak elemen dari "senin"
count = hari.count("senin")
print("Count: ", count)

#Menambah elemen hari dengan data yang ada di variable extend
extend = ["libur", "masuk"]
hari.extend(extend)
print("Extend: ", hari)

#Menghitung letak index pada "libur"
index = hari.index("libur")	
print("Index: ", index)

#Memasukkan "selasa" sebelum index ke 8
hari.insert(8, "selasa")	
print("Insert: ", hari)

#Mengetahui isi dari index ke 1
pop = hari.pop(1)
print("Pop: ", pop)

#Menghapus "masuk" yang ada pada elemen/array hari
hari.remove("masuk")
print("Remove: ", hari)

#Melakukan pembalikan data atau ditulis dari belakang lebih dahulu
hari.reverse()
print("Reverse: ", hari)

#Melakukan pengurutan data berdasarkan abjad
hari.sort()
print("Sort: ", hari)

#Melakukan pengosongan pada semua data elemen/array
hari.clear()
print("Clear: ", hari)
