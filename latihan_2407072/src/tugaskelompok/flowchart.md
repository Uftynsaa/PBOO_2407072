```mermaid
flowchart TD
    A[Start] --> B[Tampilkan Menu]
    B --> C[Input Pilihan]
    C --> D{Pilihan = 0?}
    D -- Tidak --> E{Valid?}
    E -- Ya --> F[Tambah ke Pesanan]
    E -- Tidak --> G[Error]
    F --> C
    G --> C
    D -- Ya --> H[Hitung Total]
    H --> I[Tampilkan Struk]
    I --> J[End]