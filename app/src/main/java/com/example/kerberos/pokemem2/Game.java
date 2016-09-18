package com.example.kerberos.pokemem2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Udit Manocha on 9/18/2016.
 */
public class Game extends AppCompatActivity
{
    int score = 0;

    ArrayList<Integer> disableList = new ArrayList<>();
    boolean flipped = false;
    int image = 0;
    int  button = 0;

    ImageView a;
    ImageView b;
    ImageView c;
    ImageView d;
    ImageView e;
    ImageView f;
    ImageView g;
    ImageView h;
    ImageView i;
    ImageView j;
    ImageView k;
    ImageView l;
    ImageView m;
    ImageView n;
    ImageView o;
    ImageView p;
    ImageView q;
    ImageView r;
    ImageView s;
    ImageView t;

    TextView sc;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelayout);
        a = (ImageView) findViewById(R.id.a);
        b = (ImageView) findViewById(R.id.b);
        c = (ImageView) findViewById(R.id.c);
        d = (ImageView) findViewById(R.id.d);
        e = (ImageView) findViewById(R.id.e);
        f = (ImageView) findViewById(R.id.f);
        g = (ImageView) findViewById(R.id.g);
        h = (ImageView) findViewById(R.id.h);
        i = (ImageView) findViewById(R.id.i);
        j = (ImageView) findViewById(R.id.j);
        k = (ImageView) findViewById(R.id.k);
        l = (ImageView) findViewById(R.id.l);
        m = (ImageView) findViewById(R.id.m);
        n = (ImageView) findViewById(R.id.n);
        o = (ImageView) findViewById(R.id.o);
        p = (ImageView) findViewById(R.id.p);
        q = (ImageView) findViewById(R.id.q);
        r = (ImageView) findViewById(R.id.r);
        s = (ImageView) findViewById(R.id.s);
        t = (ImageView) findViewById(R.id.t);

        sc = (TextView) findViewById(R.id.score);
        score = 0;

        View.OnClickListener test = new View.OnClickListener(){

            public void onClick (View v)
            {
                matchCondition(v.getId());
            }
        };

        a.setOnClickListener(test);
        b.setOnClickListener(test);
        c.setOnClickListener(test);
        d.setOnClickListener(test);
        e.setOnClickListener(test);
        f.setOnClickListener(test);
        g.setOnClickListener(test);
        h.setOnClickListener(test);
        i.setOnClickListener(test);
        j.setOnClickListener(test);
        k.setOnClickListener(test);
        l.setOnClickListener(test);
        m.setOnClickListener(test);
        n.setOnClickListener(test);
        o.setOnClickListener(test);
        p.setOnClickListener(test);
        q.setOnClickListener(test);
        r.setOnClickListener(test);
        s.setOnClickListener(test);
        t.setOnClickListener(test);
    }

    private void disableButtons(ArrayList<Integer> list)
    {

        for(int z = 0; z < list.size(); z++)
        {
            switch (list.get(z))
            {
                case R.id.a:
                    a.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.b:
                    b.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.c:
                    c.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.d:
                    d.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.e:
                    e.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.f:
                    f.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.g:
                    g.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.h:
                    h.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.i:
                    i.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.j:
                    j.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.k:
                    k.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.l:
                    l.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.m:
                    m.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.n:
                    n.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.o:
                    o.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.p:
                    p.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.q:
                    q.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.r:
                    r.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.s:
                    s.setClickable(false);
                    list.remove(z);
                    break;
                case R.id.t:
                    t.setClickable(false);
                    list.remove(z);
                    break;
            }
        }
    }

    private void updateScore()
    {
        score++;
        sc.setText("Score:" + score);
    }

    private void updateImage(int image)
    {
        switch (image)
        {
            case R.id.a:
                a.setImageResource(R.drawable.bulbasaur);
                break;
            case R.id.b:
                b.setImageResource(R.drawable.dratini);
                break;
            case R.id.c:
                c.setImageResource(R.drawable.ditto);
                break;
            case R.id.d:
                d.setImageResource(R.drawable.charmander);
                break;
            case R.id.e:
                e.setImageResource(R.drawable.magikarp);
                break;
            case R.id.f:
                f.setImageResource(R.drawable.gloom);
                break;
            case R.id.g:
                g.setImageResource(R.drawable.bulbasaur);
                break;
            case R.id.h:
                h.setImageResource(R.drawable.lapras);
                break;
            case R.id.i:
                i.setImageResource(R.drawable.pikachu);
                break;
            case R.id.j:
                j.setImageResource(R.drawable.gloom);
                break;
            case R.id.k:
                k.setImageResource(R.drawable.magikarp);
                break;
            case R.id.l:
                l.setImageResource(R.drawable.poliwag);
                break;
            case R.id.m:
                m.setImageResource(R.drawable.pikachu);
                break;
            case R.id.n:
                n.setImageResource(R.drawable.lapras);
                break;
            case R.id.o:
                o.setImageResource(R.drawable.dratini);
                break;
            case R.id.p:
                p.setImageResource(R.drawable.ditto);
                break;
            case R.id.q:
                q.setImageResource(R.drawable.squirtle);
                break;
            case R.id.r:
                r.setImageResource(R.drawable.charmander);
                break;
            case R.id.s:
                s.setImageResource(R.drawable.squirtle);
                break;
            case R.id.t:
                t.setImageResource(R.drawable.poliwag);
                break;
        }
    }

    private void updateImageWrongAnswer(int x) {
        switch (x) {
            case R.id.a:
                a.setImageResource(R.drawable.mew);
                break;
            case R.id.b:
                b.setImageResource(R.drawable.mew);
                break;
            case R.id.c:
                c.setImageResource(R.drawable.mew);
                break;
            case R.id.d:
                d.setImageResource(R.drawable.mew);
                break;
            case R.id.e:
                e.setImageResource(R.drawable.mew);
                break;
            case R.id.f:
                f.setImageResource(R.drawable.mew);
                break;
            case R.id.g:
                g.setImageResource(R.drawable.mew);
                break;
            case R.id.h:
                h.setImageResource(R.drawable.mew);
                break;
            case R.id.i:
                i.setImageResource(R.drawable.mew);
                break;
            case R.id.j:
                j.setImageResource(R.drawable.mew);
                break;
            case R.id.k:
                k.setImageResource(R.drawable.mew);
                break;
            case R.id.l:
                l.setImageResource(R.drawable.mew);
                break;
            case R.id.m:
                m.setImageResource(R.drawable.mew);
                break;
            case R.id.n:
                n.setImageResource(R.drawable.mew);
                break;
            case R.id.o:
                o.setImageResource(R.drawable.mew);
                break;
            case R.id.p:
                p.setImageResource(R.drawable.mew);
                break;
            case R.id.q:
                q.setImageResource(R.drawable.mew);
                break;
            case R.id.r:
                r.setImageResource(R.drawable.mew);
                break;
            case R.id.s:
                s.setImageResource(R.drawable.mew);
                break;
            case R.id.t:
                t.setImageResource(R.drawable.mew);
                break;
        }
    }

private void matchCondition(int number)
{
    switch (number)
    {
        case R.id.a:
            if(flipped)
            {
                if(image == R.drawable.bulbasaur)
                {
                    updateImage(R.id.a);
                    updateScore();
                    disableList.add(R.id.a);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.a);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.a);
                button = R.id.a;
                image =R.drawable.bulbasaur;
                flipped = true;
            }

            break;
        case R.id.b:
            if(flipped)
            {
                if(image == R.drawable.dratini)
                {
                    updateImage(R.id.b);
                    updateScore();
                    disableList.add(R.id.b);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.b);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.b);
                image =  R.drawable.dratini;
                button = R.id.b;
                flipped = true;
            }
            break;
        case R.id.c:
            if(flipped)
            {
                if(image == R.drawable.ditto)
                {
                    updateImage(R.id.c);
                    updateScore();
                    disableList.add(R.id.c);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.c);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.c);
                button = R.id.c;
                image = R.drawable.ditto;
                flipped = true;
            }

            break;
        case R.id.d:
            if(flipped)
            {
                if(image == R.drawable.charmander)
                {
                    updateImage(R.id.d);
                    updateScore();
                    disableList.add(R.id.d);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.d);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.d);
                button = R.id.d;
                image = R.drawable.charmander;
                flipped = true;
            }

            break;
        case R.id.e:
            if(flipped)
            {
                if(image == R.drawable.magikarp)
                {
                    updateImage(R.id.e);
                    updateScore();
                    disableList.add(R.id.e);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.e);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.e);
                button = R.id.e;
                image = R.drawable.magikarp;
                flipped = true;
            }

            break;
        case R.id.f:
            if(flipped)
            {
                if(image == R.drawable.gloom)
                {
                    updateImage(R.id.f);
                    updateScore();
                    disableList.add(R.id.f);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.f);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.f);
                button = R.id.f;
                image = R.drawable.gloom;
                flipped = true;
            }

            break;
        case R.id.g:
            if(flipped)
            {
                if(image == R.drawable.bulbasaur)
                {
                    updateImage(R.id.g);
                    updateScore();
                    disableList.add(R.id.g);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.g);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.g);
                image = R.drawable.bulbasaur;
                button = R.id.g;
                flipped = true;
            }

            break;
        case R.id.h:
            if(flipped)
            {
                if(image == R.drawable.lapras)
                {
                    updateImage(R.id.h);
                    updateScore();
                    disableList.add(R.id.h);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.h);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.h);
                image = R.drawable.lapras;
                button = R.id.h;
                flipped = true;
            }

            break;
        case R.id.i:
            if(flipped)
            {
                if(image == R.drawable.pikachu)
                {
                    updateImage(R.id.i);
                    updateScore();
                    disableList.add(R.id.i);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.i);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.i);
                image = R.drawable.pikachu;
                button = R.id.i;
                flipped = true;
            }

            break;
        case R.id.j:
            if(flipped)
            {
                if(image == R.drawable.gloom)
                {
                    updateImage(R.id.j);
                    updateScore();
                    disableList.add(R.id.j);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.j);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.j);
                image = R.drawable.gloom;
                button = R.id.j;
                flipped = true;
            }

            break;
        case R.id.k:
            if(flipped)
            {
                if(image == R.drawable.magikarp)
                {
                    updateImage(R.id.k);
                    updateScore();
                    disableList.add(R.id.k);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.k);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.k);
                image = R.drawable.magikarp;
                button = R.id.k;
                flipped = true;
            }

            break;
        case R.id.l:
            if(flipped)
            {
                if(image == R.drawable.poliwag)
                {
                    updateImage(R.id.l);
                    updateScore();
                    disableList.add(R.id.l);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.l);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.l);
                image = R.drawable.poliwag;
                button = R.id.l;
                flipped = true;
            }

            break;
        case R.id.m:
            if(flipped)
            {
                if(image == R.drawable.pikachu)
                {
                    updateImage(R.id.m);
                    updateScore();
                    disableList.add(R.id.m);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.m);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.m);
                image= R.drawable.pikachu;
                button = R.id.m;
                flipped = true;
            }

            break;
        case R.id.n:
            if(flipped)
            {
                if(image == R.drawable.lapras)
                {
                    updateImage(R.id.n);
                    updateScore();
                    disableList.add(R.id.n);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.n);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.n);
                image = R.drawable.lapras;
                button = R.id.n;
                flipped = true;
            }

            break;
        case R.id.o:
            if(flipped)
            {
                if(image == R.drawable.dratini)
                {
                    updateImage(R.id.o);
                    updateScore();
                    disableList.add(R.id.o);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.o);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.o);
                image = R.drawable.dratini;
                button = R.id.o;
                flipped = true;
            }

            break;
        case R.id.p:
            if(flipped)
            {
                if(image == R.drawable.ditto)
                {
                    updateImage(R.id.p);
                    updateScore();
                    disableList.add(R.id.p);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.p);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.p);
                image = R.drawable.ditto;
                button = R.id.p;
                flipped = true;
            }

            break;
        case R.id.q:
            if(flipped)
            {
                if(image == R.drawable.squirtle)
                {
                    updateImage(R.id.q);
                    updateScore();
                    disableList.add(R.id.q);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.q);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.q);
                image = R.drawable.squirtle;
                button = R.id.q;
                flipped = true;
            }
            break;
        case R.id.r:
            if(flipped)
            {
                if(image == R.drawable.charmander)
                {
                    updateImage(R.id.r);
                    updateScore();
                    disableList.add(R.id.r);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.r);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.r);
                image = R.drawable.charmander;
                button = R.id.r;
                flipped = true;
            }
            break;
        case R.id.s:
            if(flipped)
            {
                if(image == R.drawable.squirtle)
                {
                    updateImage(R.id.s);
                    updateScore();
                    disableList.add(R.id.s);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.s);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.s);
                image = R.drawable.squirtle;
                button = R.id.s;
                flipped = true;
            }

            break;
        case R.id.t:
            if(flipped)
            {
                if(image == R.drawable.poliwag)
                {
                    updateImage(R.id.t);
                    updateScore();
                    disableList.add(R.id.t);
                    disableList.add(button);
                    disableButtons(disableList);
                    flipped = false;
                }
                else
                {
                    updateImageWrongAnswer(R.id.t);
                    updateImageWrongAnswer(button);
                    flipped = false;
                    image = 0;
                }
            }
            else
            {
                updateImage(R.id.t);
                image = R.drawable.poliwag;
                button = R.id.t;
                flipped = true;
            }
            break;
        }
    }
}
