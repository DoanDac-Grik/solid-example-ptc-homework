Mỗi khối xét tuyển, lại có một kiểu tính điểm chuẩn khác nhau. Ví dụ: Khối A gồm Toán, Lí, Hóa, môn chính sẽ là Toán nên tổ hợp này sẽ tính điểm trung bình với điểm Toán được nhân đôi, cách tính tương tự với các khối khác. Vậy khi ta tạo ra class các khối, class caculate thì trong tương lai, nếu muốn tính thêm khối mới ta lại phải sửa class caculate, viết thêm các câu điều kiện để tính (đã sửa đổi trong class caculate)
=> Dùng interface chuyển hàm tính vào trong từng class khối, như vậy khi thêm 1 class chỉ cần thực thi code ở class đó.