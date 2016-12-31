import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lzp on 2016/12/28.
 * ViewHolder, 用于优化listView的item加载，优化convertView的重用效率。
 */

public class ViewHolder {
    private SparseArray<View> holder = null;

    public ViewHolder(View parent){
        holder = new SparseArray<>();
        init(parent);
    }

    /*把view中全部的View add 进 holder 中， id as key*/
    private void init(View view){
        if(view instanceof ViewGroup){
            ViewGroup root = (ViewGroup)view;
            for(int i = 0; i < root.getChildCount(); i++){
                View v = root.getChildAt(i);
                holder.put(v.getId(), v);

                init(v);
            }

        }else{
            holder.put(view.getId(),view);
        }

    }

    public  View getView(int id){
        return holder.get(id);
    }
}
