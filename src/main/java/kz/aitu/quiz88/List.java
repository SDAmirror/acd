package kz.aitu.quiz88;


    public class List {

        private Student[] studentList;
        private int size = 0;

        public List() {
            studentList = new Student[150];
        }

        public void add(Student student) {
            studentList[size++] = student;
        }

        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.println(studentList[i]);
            }
        }

        //type: name_a name_l age gps
        //order: asc desc
        public void sort(String type, String order) {
            if(type.equals("name_a") && order.equals("asc")) {
                sort_name_a_asc();
            } else if(type.equals("name_a") && order.equals("desc")) {
                sort_name_a_desc();
            } else if(type.equals("name_l") && order.equals("asc")) {
                sort_name_l_asc();
            } else if(type.equals("name_l") && order.equals("desc")) {
                sort_name_l_desc();
            } else if(type.equals("age") && order.equals("asc")) {
                sort_age_asc();
            } else if(type.equals("age") && order.equals("desc")) {
                sort_age_desc();
            } else if(type.equals("gpa") && order.equals("asc")) {
                sort_gpa_asc();
            } else if(type.equals("gpa") && order.equals("desc")) {
                sort_gpa_desc();
            }
        }

        public void sort_name_a_asc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getName().codePointAt(0) > studentList[j+1].getName().codePointAt(0)&&studentList[j].getName().codePointAt(0) != studentList[j+1].getName().codePointAt(0)){

                    }else if (studentList[j].getName().codePointAt(1) > studentList[j+1].getName().codePointAt(1)&&studentList[j].getName().codePointAt(1) != studentList[j+1].getName().codePointAt(1)){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp; }
                }

            }
        }

        public void sort_name_a_desc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getName().codePointAt(0) < studentList[j+1].getName().codePointAt(0)){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }
        }

        public void sort_name_l_asc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getName().length() > studentList[j+1].getName().length()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }
        }

        public void sort_name_l_desc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getName().length() < studentList[j+1].getName().length()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }
        }

        public void sort_age_asc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getAge() > studentList[j+1].getAge()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }

        }

        public void sort_age_desc() {
            Student temp;
            int count=0;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getAge() < studentList[j+1].getAge()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }


                }

            }
        }

        public void sort_gpa_asc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getGpa() > studentList[j+1].getGpa()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }

        }

        public void sort_gpa_desc() {
            Student temp;

            for (int i = 0; i < size ; i++) {

                for (int j = 0; j < size-i-1; j++){
                    if (studentList[j].getGpa() < studentList[j+1].getGpa()){
                        temp = studentList[j];
                        studentList[j] =(studentList[j+1]);
                        studentList[j+1] =temp;
                    }
                }

            }

        }
    }

