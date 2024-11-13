# WisnuSetiaBudi-PBO2-Tugas2-konversiSuhu

# Program Konversi Suhu

Aplikasi sederhana berbasis Java Swing untuk mengonversi suhu antara beberapa skala, yaitu Celcius, Fahrenheit, Reamur, dan Kelvin. Aplikasi ini menyediakan antarmuka intuitif untuk pengguna yang ingin melakukan konversi suhu dengan cepat.
Fitur

    Input Suhu: Pengguna dapat memasukkan nilai suhu untuk dikonversi.
    Pilihan Konversi: Dropdown menu untuk memilih jenis konversi suhu:
        Celcius ke Fahrenheit, Reamur, atau Kelvin.
        Fahrenheit ke Celcius, Reamur, atau Kelvin.
        Reamur ke Celcius, Fahrenheit, atau Kelvin.
        Kelvin ke Celcius, Fahrenheit, atau Reamur.
    Validasi Input: Hanya menerima angka atau desimal sebagai input. Karakter lain akan diabaikan.
    Hapus Data: Tombol untuk mengosongkan input dan hasil konversi.
    Keluar Aplikasi: Tombol untuk menutup aplikasi.

Cara Penggunaan

    Masukkan nilai suhu pada kolom input.
    Pilih jenis konversi yang diinginkan dari menu dropdown.
    Klik tombol Konversi untuk melihat hasil konversi.
    Gunakan tombol Hapus untuk mengosongkan kolom input dan hasil konversi.
    Klik tombol Keluar untuk menutup aplikasi.

Struktur Kode

    konversiSuhu.java: Kelas utama yang menangani antarmuka pengguna dan logika program.
        konversiSuhuActionPerformed: Fungsi utama yang menangani logika konversi berdasarkan pilihan pengguna.
        inputSuhuActionPerformed: Fungsi untuk menangani input suhu dan memvalidasi agar hanya angka yang bisa dimasukkan.
        jButton2.addActionListener: Menambahkan aksi untuk tombol "Hapus" yang akan mengosongkan input dan hasil.
        exit.addActionListener: Menambahkan aksi untuk tombol "Keluar" untuk menutup aplikasi.

![image](https://github.com/user-attachments/assets/f61dd502-a324-4c34-8a72-9762a44e0564)
