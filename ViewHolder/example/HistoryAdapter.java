import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.olddriver.R;
import com.example.olddriver.util.ViewHolder;

import java.util.List;

public class HistoryAdapter extends BaseAdapter{
    private LayoutInflater inflater;


    public HistoryAdapter(Context context) {
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return locations==null?0:locations.size();
    }

    @Override
    public Object getItem(int position) {
        return locations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view= null;
        ViewHolder holder = null;

        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_historylist,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)(convertView.getTag());
        }

        TextView tv_title= (TextView) holder.getView(R.id.used_title);
        TextView tv_address= (TextView) holder.getView(R.id.used_address);


        tv_title.setText("title " + position);
        tv_address.setText("address " + position);

        return view;
    }
}
