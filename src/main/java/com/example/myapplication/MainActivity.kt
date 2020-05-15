package com.example.myapplication

import android.app.Service
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.core.content.ContextCompat.getSystemService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numxiao1=0.0
        var numxiao2=0.0
        var fuhao =""
        var have_xiaoshudian=false
        val vibrator = getSystemService(Service.VIBRATOR_SERVICE) as Vibrator
        val madas = longArrayOf(100,100)

        imageView3.setOnClickListener {
            val intant = Intent(this,About::class.java)
            startActivity(intant)
        }
        more.setOnClickListener {
            val intant = Intent(this,More::class.java)
            startActivity(intant)
        }
        number0.setOnClickListener {
            input.text=input.text.toString()+"0"
            vibrator.vibrate(madas, -1)

        }
        number1.setOnClickListener {
            

            input.text=input.text.toString()+"1"
            vibrator.vibrate(madas, -1)
        }
        number2.setOnClickListener {


            input.text=input.text.toString()+"2"
            vibrator.vibrate(madas, -1)
        }
        number3.setOnClickListener {

            input.text=input.text.toString()+"3"
            vibrator.vibrate(madas, -1)
        }

        number4.setOnClickListener {

            input.text=input.text.toString()+"4"
            vibrator.vibrate(madas, -1)
        }
        number5.setOnClickListener {

            input.text=input.text.toString()+"5"
            vibrator.vibrate(madas, -1)

        }
        number6.setOnClickListener {

            input.text=input.text.toString()+"6"
            vibrator.vibrate(madas, -1)

        }
        number7.setOnClickListener {

            input.text=input.text.toString()+"7"
            vibrator.vibrate(madas, -1)

        }
        number8.setOnClickListener {

            input.text=input.text.toString()+"8"
            vibrator.vibrate(madas, -1)

        }
        number9.setOnClickListener {

            input.text=input.text.toString()+"9"
            vibrator.vibrate(madas, -1)

        }
        numberxJIA.setOnClickListener {
            if(input.text.toString()==""){
                vibrator.vibrate(madas, -1)

            }
            else {
                vibrator.vibrate(madas, -1)

                if (have_xiaoshudian == true) {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                        gongshi.text=gongshi.text.toString()+numxiao2.toString()
                        input.text = (numxiao1 + numxiao2).toString()
                        numxiao1=input.text.toString().toDouble()
                        numxiao2=0.0

                    }
                }
                else {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                        gongshi.text=gongshi.text.toString()+numxiao2.toString()

                        input.text = (numxiao1 + numxiao2).toInt().toString()
                        numxiao1=input.text.toString().toDouble()

                        numxiao2=0.0

                    }


        }
                fuhao = "+"
                gongshi.text = input.text.toString()+"+"
                input.text=""
            }
        }

        numberxJIAN.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                if (have_xiaoshudian == true) {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }

                } else {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }


                }

                fuhao = "-"
                gongshi.text = input.text.toString() + "-"
                input.text = ""

            }
        }
        numberx.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                if (have_xiaoshudian == true) {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }

                } else {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }

                }

                fuhao = "×"

                gongshi.text = input.text.toString() + "×"
                input.text = ""

            }
        }

        numberxchu.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                if (have_xiaoshudian == true) {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }

                } else {
                    if (numxiao1 == 0.0) {
                        numxiao1 = input.text.toString().toDouble()
                    } else if (numxiao1 != 0.0) {
                        numxiao2 = input.text.toString().toDouble()
                    }

                }

                fuhao = "÷"

                gongshi.text = input.text.toString() + "÷"
                input.text = ""

            }
        }
        numberbaifen.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                input.text = ((input.text.toString().toDouble()) / 100).toString()
                have_xiaoshudian = true

            }
        }
        numberc.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                if (input.text.toString() == "") {

                } else {
                    var m = input.text.toString()
                    val char1 = m.last()
                    if (char1 == '.' || have_xiaoshudian == true) {
                        have_xiaoshudian = false
                    }

                    input.text = m.substring(0,m.length-1)
                }


            }
        }
        numberdian.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            } else {
                vibrator.vibrate(madas, -1)

                input.text = input.text.toString() + "."
                have_xiaoshudian = true
            }
        }
        numberdel.setOnClickListener {
            input.text=""
            gongshi.text=""
            numxiao1=0.0
            numxiao2=0.0
            vibrator.vibrate(madas, -1)

        }

        numberxdeng.setOnClickListener {
            if (input.text.toString() == "") {
                vibrator.vibrate(madas, -1)

            }
            else {
                vibrator.vibrate(madas, -1)

                val t = input.text.toString()
                gongshi.text = gongshi.text.toString() + t

                if (fuhao == "+") {
                    if (have_xiaoshudian == true) {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    } else {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    }
                    if (have_xiaoshudian == true) {

                        input.text = (numxiao1 + numxiao2).toString()
                    } else {
                        input.text = (numxiao1 + numxiao2).toInt().toString()
                    }
                } else if (fuhao == "-") {
                    if (have_xiaoshudian == true) {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    } else {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    }
                    if (have_xiaoshudian == true) {
                        input.text = (numxiao1 - numxiao2).toString()
                    } else {
                        input.text = (numxiao1 - numxiao2).toInt().toString()
                    }
                } else if (fuhao == "×") {
                    if (have_xiaoshudian == true) {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    } else {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    }
                    if (have_xiaoshudian == true) {
                        input.text = (numxiao1 * numxiao2).toString()
                    } else {
                        input.text = (numxiao1 * numxiao2).toInt().toString()
                    }
                } else {
                    if (have_xiaoshudian == true) {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    } else {
                        if (numxiao1 == 0.0) {
                            numxiao1 = input.text.toString().toDouble()
                        } else if (numxiao1 != 0.0) {
                            numxiao2 = input.text.toString().toDouble()
                        }
                    }
                    if (have_xiaoshudian == true) {
                        input.text = (numxiao1 / numxiao2).toString()
                    } else {
                        input.text = (numxiao1 / numxiao2).toString()
                    }
                }

                if (have_xiaoshudian == true) {
                    numxiao1 = input.text.toString().toDouble()
                } else {
                    numxiao1 = input.text.toString().toDouble()

                }
            }
        }
    }
}
