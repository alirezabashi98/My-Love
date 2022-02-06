package com.alireza.bashi.mylove.fatemeh

import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.alireza.bashi.mylove.fatemeh.ui.theme.MyLoveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoveTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(Color.Black)
                    ) {
                        Box {
                            DefaultPreview()
                        }
                        Column(
                            Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
//                            Text(text = "Fatemeh", color = Color.White, fontSize = 25.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val data_Heart = "<!-- Created by 2Math-->\n" +
            "\n" +
            "<!doctype html>\n" +
            "<html>\n" +
            "    <head>\n" +
            "        <title>heart</title>\n" +
            "        <meta charset=\"utf-8\">\n" +
            "        <style>\n" +
            "        /* Created by 2Math */\n" +
            "body {\n" +
            "    margin:0;\n" +
            "    padding:0;\n" +
            "    background-color:#000;\n" +
            "}\n" +
            "        </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "        <canvas id=\"c\"></canvas>\n" +
            "        <script>\n" +
            "            var b = document.body;\n" +
            "            var c = document.getElementsByTagName('canvas')[0];\n" +
            "            var a = c.getContext('2d');\n" +
            "            document.body.clientWidth; \n" +
            "        </script>\n" +
            "        <script>\n" +
            "        // Created by 2Math\n" +
            "\n" +
            "//js1k.com/2012-love/details/1071https://js1k.com/2012-love/details/1071\n" +
            "window.onload = function(){\n" +
            "    var c = document.getElementById('c');\n" +
            "\n" +
            "e = [];// trails\n" +
            "h = [];// heart path\n" +
            "O = c.width = innerWidth;\n" +
            "Q = c.height = innerHeight;\n" +
            "v = 32; // num trails, num particles per trail & num nodes in heart path\n" +
            "M = Math;\n" +
            "R = M.random;\n" +
            "C = M.cos;\n" +
            "Y = 44/7;// close to 44/7 or Math.PI * 2 - 6.3 seems is close enough. \n" +
            "for( i = 0; i <Y; i+=.2 ) { // calculate heart nodes, from http://mathworld.wolfram.com/HeartCurve.html\n" +
            "    h.push([\n" +
            "        O/2 + 180*M.pow(M.sin(i), 3),\n" +
            "        Q/2 + 10 * (-(15*C(i) - 5*C(2*i) - 2*C(3*i) - C(4*i)))\n" +
            "    ])\n" +
            "}\n" +
            "\n" +
            "i = 0;\n" +
            "while (i < v ) {\n" +
            "\n" +
            "    x = R() * O;\n" +
            "    y = R() * Q;\n" +
            "    //r = R() * 50 + 200;\n" +
            "    //b = R() * r;\n" +
            "    //g = R() * b;\n" +
            "\n" +
            "    H = i/v * 80 + 280;\n" +
            "    S = R() * 40 + 60;\n" +
            "    B = R() * 60 + 20;\n" +
            "\n" +
            "    f = []; // create new trail\n" +
            "\n" +
            "    k = 0;\n" +
            "    while ( k < v ) { \n" +
            "        f[k++] = { // create new particle\n" +
            "            x : x, // position \n" +
            "            y : y,\n" +
            "            X : 0, // velocity\n" +
            "            Y : 0,\n" +
            "            R : (1 - k/v)  + 1, // radius\n" +
            "            S : R() + 1, // acceleration \n" +
            "            q : ~~(R() * v), // target node on heart path\n" +
            "            //D : R()>.5?1:-1,\n" +
            "            D : i%2*2-1, // direction around heart path\n" +
            "            F : R() * .2 + .7, // friction\n" +
            "            //f : \"rgba(\" + ~~r + \",\" + ~~g + \",\" + ~~b + \",.1)\"\n" +
            "            f : \"hsla(\"+~~H+\",\"+~~S+\"%,\"+~~B+\"%,.1)\" // colour\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    e[i++] = f; // dots are a 2d array of trails x particles\n" +
            "}\n" +
            "\n" +
            "function render(_) { // draw particle\n" +
            "    a.fillStyle = _.f;\n" +
            "    a.beginPath();\n" +
            "    a.arc(_.x, _.y, _.R, 0, Y, 1);\n" +
            "    a.closePath();\n" +
            "    a.fill();\n" +
            "}\n" +
            "\n" +
            "setInterval(function(){\n" +
            "\n" +
            "    a.fillStyle = \"rgba(0,0,0,.2)\"; // clear screen\n" +
            "    a.fillRect(0,0,O,Q);\n" +
            "\n" +
            "    i = v;\n" +
            "    while (i--) {\n" +
            "\n" +
            "        f = e[ i ]; // get worm\n" +
            "        u = f[ 0 ]; // get 1st particle of worm\n" +
            "        q = h[ u.q ]; // get current node on heart path\n" +
            "        D = u.x - q[0]; // calc distance\n" +
            "        E = u.y - q[1];\n" +
            "        G = M.sqrt( (D * D) + (E * E) );\n" +
            "        \n" +
            "        if ( G < 10 ) { // has trail reached target node?\n" +
            "            if (R() > .95 ) { // randomly send a trail elsewhere\n" +
            "                u.q = ~~(R() * v);\n" +
            "            } else {\n" +
            "                if ( R() > .99) u.D *= -1; // randomly change direction\n" +
            "                u.q += u.D;\n" +
            "                u.q %= v;\n" +
            "                if ( u.q < 0 ) u.q += v;\n" +
            "             }\n" +
            "        }\n" +
            "\n" +
            "        u.X += -D / G * u.S; // calculate velocity\n" +
            "        u.Y += -E / G * u.S;\n" +
            "\n" +
            "        u.x += u.X; // apply velocity\n" +
            "        u.y += u.Y;\n" +
            "\n" +
            "        render(u); // draw the first particle\n" +
            "\n" +
            "        u.X *= u.F; // apply friction\n" +
            "        u.Y *= u.F;\n" +
            "\n" +
            "        k = 0;\n" +
            "        while ( k < v-1 ) { // loop through remaining dots\n" +
            "            \n" +
            "            T = f[ k ]; // this particle\n" +
            "            N = f[ ++k ]; // next particle\n" +
            "\n" +
            "            N.x -= (N.x - T.x) * .7; // use zenos paradox to create trail\n" +
            "            N.y -= (N.y - T.y) * .7;\n" +
            "\n" +
            "            render(N);\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}\n" +
            ", 25);}\n" +
            "        </script>\n" +
            "</body>\n" +
            "</html>"

    val data_Birth = "<!-- Created by Adnan Zawad Toky-->\n" +
            "\n" +
            "<!--Click/Touch the screen one or two times-->\n" +
            "<!--Created By Adnan Zawad Toky-->\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "    <head>\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scatitlele=1\" >\n" +
            "        <title>Love Fatemeh</title>\n" +
            "        <style>\n" +
            "        /* Created by Adnan Zawad Toky */\n" +
            "\n" +
            "/*@import url('https://fonts.googleapis.com/css?family=Exo|Josefin+Slab|Lobster|Satisfy');\n" +
            "        */   \n" +
            "           body {\n" +
            "                margin:0;\n" +
            "            }\n" +
            "            \n" +
            "            .lesh{\n" +
            "                font-size:120px;\n" +
            "            }\n" +
            "            \n" +
            "            \n" +
            "            @keyframes a{\n" +
            "                0%{\n" +
            "                    transform:scale(1.1);\n" +
            "                }\n" +
            "                25%{\n" +
            "                    transform:scale(1.5);\n" +
            "                }\n" +
            "                50%{\n" +
            "                    transform:scale(1.1);\n" +
            "                }\n" +
            "                75%{\n" +
            "                    transform:scale(.7);\n" +
            "                }\n" +
            "                100%{\n" +
            "                    transform:scale(1.1)\n" +
            "                }\n" +
            "            }\n" +
            "            \n" +
            "            @keyframes b{\n" +
            "                0%{\n" +
            "                    transform:scale(1.1);\n" +
            "                }\n" +
            "                25%{\n" +
            "                    transform:scale(.7);\n" +
            "                }\n" +
            "                50%{\n" +
            "                    transform:scale(1.1);\n" +
            "                }\n" +
            "                75%{\n" +
            "                    transform:scale(1.5);\n" +
            "                }\n" +
            "                100%{\n" +
            "                    transform:scale(1.1)\n" +
            "                }\n" +
            "            \n" +
            "            }\n" +
            "            \n" +
            "            #d{\n" +
            "                background:-webkit-linear-gradient(left,rgb(0,0,255),rgb(110,200,0),rgb(255,0,0));\n" +
            "                color:transparent;\n" +
            "                -webkit-background-clip: text;\n" +
            "                background-clip: text;\n" +
            "                font-family: 'Lobster', cursive;\n" +
            "                font-size:30px;\n" +
            "                text-align:center;\n" +
            "                animation:a 2s linear infinite;\n" +
            "                margin:20px auto 10px;\n" +
            "                z-index:500;\n" +
            "            }\n" +
            "            \n" +
            "            #hvd{\n" +
            "                background:-webkit-linear-gradient(left,rgb(252,142,83),rgb(42,242,176),rgb(42,181,255),rgb(125,85,255),rgb(249,67,252));\n" +
            "                color:transparent;\n" +
            "                -webkit-background-clip: text;\n" +
            "                background-clip: text;\n" +
            "                font-family: 'Satisfy', cursive;\n" +
            "                font-size:30px;\n" +
            "                text-align:center;\n" +
            "                animation:b 2s linear infinite;\n" +
            "                z-index:500;\n" +
            "            }\n" +
            "            \n" +
            "            #myCanvas {\n" +
            "                position:absolute;\n" +
            "                top:0;\n" +
            "                left:0;\n" +
            "                z-index:-100;\n" +
            "            }\n" +
            "        </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "        <div id=\"d\">\n" +
            "          ♡ I Love Fatemeh\n" +
            "        </div>\n" +
            "        <div id=\"hvd\">\n" +
            "             \n" +
            "            <br />\n" +
            "            <br />\n" +
            "          <b class=\"lesh\" style=\"font-size:50px;\"> Happy birthday Fatemeh </b>\n" +
            "          </div>\n" +
            "        <canvas id=\"myCanvas\"></canvas>\n" +
            "        <script>\n" +
            "        // Created by Adnan Zawad Toky\n" +
            "\n" +
            "var c,w,h;\n" +
            "window.onload=function(){\n" +
            "    w=window.innerWidth;\n" +
            "            h=window.innerHeight;\n" +
            "            if(w<100 || h<100){\n" +
            "                w=360;\n" +
            "                h=560;\n" +
            "            }\n" +
            "            \n" +
            "            c=document.getElementById(\"myCanvas\");\n" +
            "                c.height=h;\n" +
            "                c.width=w;\n" +
            "            var ctx=c.getContext(\"2d\");\n" +
            "            \n" +
            "            var particle={\n" +
            "                number:80,\n" +
            "                radius:2,\n" +
            "                velocity:6,\n" +
            "                acceleration:.04,\n" +
            "                time:1,\n" +
            "                angle:Math.PI/this.number\n" +
            "            }\n" +
            "            \n" +
            "            var rocket={\n" +
            "                number:5,\n" +
            "                x:w/2,\n" +
            "                y:h/2,\n" +
            "                h:w/2,\n" +
            "                max:4,\n" +
            "            }\n" +
            "            \n" +
            "            var rockets=[];\n" +
            "            \n" +
            "            var z=1;\n" +
            "            if(z>(rocket.max-1)){\n" +
            "                z=0;\n" +
            "            }\n" +
            "            \n" +
            "            var countTouch=0;\n" +
            "            var maxCountTouch=3;\n" +
            "            \n" +
            "            var bdColors=[\"225,27,28\",\"0,107,79\"];\n" +
            "\n" +
            "            \n" +
            "            function rocketBuilder(p,q,r){\n" +
            "                rockets[p]=[];\n" +
            "                for(n=0;n<particle.number;n++){\n" +
            "                    rockets[p][n]={\n" +
            "                        x:q,\n" +
            "                        y:r,\n" +
            "                        dx:particle.velocity*Math.cos(particle.number*n)*Math.random()/1.2,\n" +
            "                        dy:particle.velocity*Math.sin(particle.number*n)*Math.random(),\n" +
            "                        red:Math.floor(Math.random()*255),\n" +
            "                        green:Math.floor(Math.random()*255),\n" +
            "                        blue:Math.floor(Math.random()*255)\n" +
            "                    }\n" +
            "                    if(z%2==0){\n" +
            "                        rockets[p][n].color=bdColors[Math.floor(Math.random()*2)]\n" +
            "                    }\n" +
            "                }\n" +
            "                rockets[p][particle.number+1]=1;\n" +
            "            }\n" +
            "            \n" +
            "            rocketBuilder(0,rocket.x,rocket.y);\n" +
            "            \n" +
            "            \n" +
            "            function clearCanvas(){\n" +
            "                ctx.beginPath();\n" +
            "                ctx.rect(0,0,w,h);\n" +
            "                ctx.fillStyle=\"rgba(0,0,0,.06)\";\n" +
            "                ctx.fill();\n" +
            "                ctx.closePath();\n" +
            "            }\n" +
            "            \n" +
            "            function fade(i){\n" +
            "                rockets[i][particle.number+1]-=.007;\n" +
            "            }\n" +
            "            \n" +
            "            function draw(i,interval){\n" +
            "                clearCanvas();\n" +
            "                for(n=0;n<particle.number;n++){\n" +
            "                    ctx.beginPath();\n" +
            "                    ctx.arc(rockets[i][n].x,h-rockets[i][n].y,particle.radius,0,Math.PI*2);\n" +
            "                    if(rockets[i][n].color){\n" +
            "                        ctx.fillStyle=\"rgba(\"+rockets[i][n].color+\",\"+rockets[i][particle.number+1]+\")\";\n" +
            "                    }\n" +
            "                    else{\n" +
            "                        ctx.fillStyle=\"rgba(\"+rockets[i][n].red+\",\"+rockets[i][n].green+\",\"+rockets[i][n].blue+\",\"+rockets[i][particle.number+1]+\")\";\n" +
            "                    }\n" +
            "                    ctx.fill();\n" +
            "                    ctx.closePath();\n" +
            "                    rockets[i][n].x+=rockets[i][n].dx;\n" +
            "                    rockets[i][n].y+=rockets[i][n].dy;\n" +
            "                    rockets[i][n].dy-=particle.acceleration*particle.time;\n" +
            "                }\n" +
            "                if(rockets[i][particle.number-1].y<200){\n" +
            "                    fade(i);\n" +
            "                    if(rockets[i][particle.number+1]<0){\n" +
            "                        clearInterval(interval)\n" +
            "                        randomUpdate();\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "            \n" +
            "            function update(k){\n" +
            "                setTimeout(function(){\n" +
            "                    var intv=setInterval(function(){\n" +
            "                        draw(k,intv);\n" +
            "                    },15)\n" +
            "                },1000)\n" +
            "            }\n" +
            "            \n" +
            "            function randomUpdate(){\n" +
            "                rocketBuilder(z,Math.floor(Math.random()*w),Math.floor(Math.random()*h));\n" +
            "                update(z);\n" +
            "                z++;\n" +
            "            }\n" +
            "            \n" +
            "            \n" +
            "            //window.onload=update(0);\n" +
            "    update(0);\n" +
            "    /*\n" +
            "            c.addEventListener(\"touchstart\",function(e){\n" +
            "                if(countTouch<maxCountTouch){\n" +
            "                    var touchObject=e.changedTouches[0];\n" +
            "                    var pointX=parseInt(touchObject.clientX);\n" +
            "                    var pointY=parseInt(touchObject.clientY);\n" +
            "                    rocketBuilder(z,pointX,h-pointY);\n" +
            "                    update(z);\n" +
            "                    z++;\n" +
            "                    countTouch++;\n" +
            "                }\n" +
            "            })\n" +
            "            */\n" +
            "            c.addEventListener(\"mousedown\",function(e){\n" +
            "                if(countTouch<maxCountTouch){\n" +
            "                    var pointX=parseInt(e.clientX);\n" +
            "                    var pointY=parseInt(e.clientY);\n" +
            "                    rocketBuilder(z,pointX,h-pointY);\n" +
            "                    update(z);\n" +
            "                    z++;\n" +
            "                    countTouch++;\n" +
            "                }\n" +
            "            })\n" +
            "\n" +
            "}\n" +
            "            \n" +
            "            window.onresize=function(){\n" +
            "                w=window.innerWidth;\n" +
            "                h=window.innerHeight;\n" +
            "                c.height=h;\n" +
            "                c.width=w;\n" +
            "            }\n" +
            "        </script>\n" +
            "    </body>\n" +
            "</html>"


    MyLoveTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            AndroidView(
                modifier = Modifier.fillMaxSize(), factory = {
                    WebView(it).apply {
                        webViewClient = WebViewClient()

                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                        settings.javaScriptEnabled = true

                        loadDataWithBaseURL(
                            null,
                            data_Birth,
                            "text/HTML",
                            "UTF-8",
                            null
                        )
                    }
                })
        }
    }
}