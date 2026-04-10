
public class LecturerData {

    Lecturer[] lecturerData = new Lecturer[10];
    int idx = 0;

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("The data is full");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j< idx -i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = 0;
            for(int j = 0; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer temp = lecturerData[maxIdx];
            lecturerData[maxIdx] = lecturerData[i];
            lecturerData[i] = temp;
        } 
    }
}
