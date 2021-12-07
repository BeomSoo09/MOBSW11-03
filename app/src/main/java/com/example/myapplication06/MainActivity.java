package com.example.myapplication06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
=======
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
<<<<<<< HEAD

    private Button memberfixButton;
=======
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user == null){
<<<<<<< HEAD
            // 회원정보가 없을 경우 회원정보수정 화면으로 이동
=======
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a
            myStartActivity(SignUpActivity.class);
        }else{
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            DocumentReference docRef = db.collection("users").document(user.getUid());
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if(document != null){
                            if (document.exists()) {
                                Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                            } else {
                                Log.d(TAG, "No such document");
                                myStartActivity(MemberInitActivity.class);
                            }
                        }
                    } else {
                        Log.d(TAG, "get failed with ", task.getException());
                    }
                }
            });
        }
        findViewById(R.id.logoutButton).setOnClickListener(onClickListener);
<<<<<<< HEAD

        // 회원정보수정 버튼 연결
        memberfixButton = findViewById(R.id.memberfixButton);
        memberfixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberInitActivity.class);
                startActivity(intent); // 회원정보수정 액티비티로 이동
            }
        });
    }



=======
    }

>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.logoutButton:
                    FirebaseAuth.getInstance().signOut();
                    myStartActivity(SignUpActivity.class);
                    break;
            }
        }
    };

    private void myStartActivity(Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }
}