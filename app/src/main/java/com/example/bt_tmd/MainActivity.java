package com.example.bt_tmd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategoryAdapter;
import shop.Shop;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcvCategory= findViewById(R.id.rcv_category);
        categoryAdapter= new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){

        List<Category> listCategory = new ArrayList<>();
        List<Shop> listIPhone = new ArrayList<>();
        List<Shop> listSamSung = new ArrayList<>();
        List<Shop> listOppo = new ArrayList<>();
        List<Shop> listXiaomi = new ArrayList<>();
        listIPhone.add(new Shop(R.drawable.ip12prm, "iPhone 12 Pro Max 512 GB"));
        listIPhone.add(new Shop(R.drawable.ip12, "iPhone 12 Mini 512 GB"));
        listIPhone.add(new Shop(R.drawable.ip12_1, "iPhone 12 64GB"));
        listIPhone.add(new Shop(R.drawable.ip11prm, "iPhone 11 Pro Max 256 GB"));
        listIPhone.add(new Shop(R.drawable.ipse, "iPhone SE 2020 64GB"));
        listIPhone.add(new Shop(R.drawable.ipxs, "iPhone Xs 256 GB"));

        listSamSung.add(new Shop(R.drawable.galaxynote20ultra5gtrang, "Samsung Galaxy Note 20 Ultra 5G Trắng"));
        listSamSung.add(new Shop(R.drawable.galaxys20fe, "Điện thoại Samsung Galaxy S20 FE"));
        listSamSung.add(new Shop(R.drawable.galaxym51, "Điện thoại Samsung Galaxy M51"));
        listSamSung.add(new Shop(R.drawable.galaxyzfold25g, "Điện thoại Samsung Galaxy Z Fold2 5G\n"));

        listOppo.add(new Shop(R.drawable.oppo1, "OPPO A92"));
        listOppo.add(new Shop(R.drawable.oppo2, "OPPO Find X2"));
        listOppo.add(new Shop(R.drawable.oppo3, "OPPO Reno3 Pro"));
        listOppo.add(new Shop(R.drawable.oppo4, "OPPO Reno4 Pro"));
        listOppo.add(new Shop(R.drawable.oppo5, "OPPO A93"));

        listXiaomi.add(new Shop(R.drawable.xiaomi1, "Điện thoại Xiaomi Redmi 9"));
        listXiaomi.add(new Shop(R.drawable.xiaomi2, "Điện thoại Xiaomi Mi 10T Pro 5G"));
        listXiaomi.add(new Shop(R.drawable.xiaomi3, "Điện thoại Xiaomi Redmi Note 9 Pro"));
        listXiaomi.add(new Shop(R.drawable.xiaomi4, "Điện thoại Xiaomi POCO X3 NFC"));
        listXiaomi.add(new Shop(R.drawable.xiaomi5, "Điện thoại Xiaomi Redmi Note 8 Pro"));

        listCategory.add(new Category("Apple", listIPhone));
        listCategory.add(new Category("Samsung", listSamSung));
        listCategory.add(new Category("OPPO", listOppo));
        listCategory.add(new Category("Xiaomi", listXiaomi));
        return listCategory;
    }
    }
