package service;

public class Menu {
    public static void showMenu() {
        System.out.println("\n|| =============MENU============= ||");
        System.out.println("|| 1. Xem danh sách học viên      ||");
        System.out.println("|| 2. Thêm học viên               ||");
        System.out.println("|| 3. Sửa thông tin học viên      ||");
        System.out.println("|| 4. Xóa học viên                ||");
        System.out.println("|| 5. Nhập điểm học viên          ||");
        System.out.println("|| 6. Sửa điểm học viên           ||");
        System.out.println("|| 7. Xếp loại học viên           ||");
        System.out.println("|| 8. Bảng điểm môn học           ||");
        System.out.println("|| 0. Quay lại menu đăng nhập     ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void menuStudent() {
        System.out.println("\n|| =============MENU============= ||");
        System.out.println("|| 1. Xem danh sách học sinh      ||");
        System.out.println("|| 2. Bảng điểm môn học           ||");
        System.out.println("|| 3. Tìm theo tên                ||");
        System.out.println("|| 4. Đổi mật khẩu                ||");
        System.out.println("|| 0. Quay lại menu đăng nhập     ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void menuScore() {
        System.out.println("\n|| ====Nhập điểm các môn học===== ||");
        System.out.println("|| 1. Nhập điểm Toán              ||");
        System.out.println("|| 2. Nhập điểm Hóa               ||");
        System.out.println("|| 3. Nhập điểm Sinh              ||");
        System.out.println("|| 4. Nhập điểm Lý                ||");
        System.out.println("|| 0. Quay lại Menu               ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void showScore() {
        System.out.println("\n|| ======Bảng điểm môn học======= ||");
        System.out.println("|| 1. Bảng điểm Toán              ||");
        System.out.println("|| 2. Bảng điểm Hóa               ||");
        System.out.println("|| 3. Bảng điểm Sinh              ||");
        System.out.println("|| 4. Bảng điểm Lý                ||");
        System.out.println("|| 0. Quay lại Menu               ||");
        System.out.println("|| =============================  ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void MenuEditScore() {
        System.out.println("\n|| =======Chỉnh sửa điểm========= ||");
        System.out.println("|| 1. Sửa điểm Toán               ||");
        System.out.println("|| 2. Sửa điểm Hóa                ||");
        System.out.println("|| 3. Sửa điểm Sinh               ||");
        System.out.println("|| 4. Sửa điểm Lý                 ||");
        System.out.println("|| 0. Quay lại Menu               ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void menuAdmin() {
        System.out.println("\n|| ========Đăng nhập Admin======= ||");
        System.out.println("|| 1. Đăng ký                     ||");
        System.out.println("|| 2. Thay đổi mật khẩu           ||");
        System.out.println("|| 3. Xóa                         ||");
        System.out.println("|| 0. Thoát                       ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void menuLogin() {
        System.out.println("\n|| ===========Đăng nhập========== ||");
        System.out.println("|| 1. Giáo Viên                   ||");
        System.out.println("|| 2. Học sinh                    ||");
        System.out.println("|| 0. Thoát                       ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }

    public static void menuSort() {
        System.out.println("\n|| ===========Sắp xếp============ ||");
        System.out.println("|| 1. Theo điểm trung bình        ||");
        System.out.println("|| 2. Theo tên                    ||");
        System.out.println("|| 0. Quay lại Menu               ||");
        System.out.println("|| ============================== ||");
        System.out.print("Nhập lựa chọn: ");
    }
}
