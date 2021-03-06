package uit.app.a18520790_dangquanghung_lab2_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewContactInfoActivity extends Activity {
    TextView txtNameValue;
    TextView txtEmailValue;
    TextView txtProjectValue;

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.contactinfo);

        txtNameValue = (TextView) findViewById(R.id.nameVal);
        txtEmailValue = (TextView) findViewById(R.id.emailVal);
        txtProjectValue = (TextView) findViewById(R.id.projectVal);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");

        txtEmailValue.setText(email);
        txtNameValue.setText(name);
        txtProjectValue.setText(project);
    }
    public void onClick(View v){
        finish();
    }
}
