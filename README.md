<article class="markdown-body entry-content" itemprop="text">
<h1><a id="Android_CK-PassingValues" class="anchor" href="#Android_CK-PassingValues" aria-hidden="true"></a>Android_CK-PassingValues</h1>
<p>This project is a brief on how values can be passed from one activity to another. </p>
<h2>What is Intent?</h2>

<p>An Intent is basically a message to indicate you want something to happen. On receiving the intent, the apps will react accordingly.</p>

<h5>Description:</h5>

<p>In this project,  we will discuss  about  how to pass value from one activity to another activity.</p>

<ul>
<li>Step 1: Create activity_main.xml. Create Username and Password Edittext with the button, so that when the input is given and the button is clicked, the values will pass to next activity.
<br><br>
<img src="http://armorappz.com/github/passing-valu-img1.png">
</li>
<br><br>
<li>Step 2: Create second_activity.xml. In this create a textview so that the values received from the mainActivity will be displayed here.
<br><br>
<img src="http://armorappz.com/github/passing-valu-img2.png">
</li>
<br><br>
<li>Step 3: Create a MainActivity.class. Get the value from user in the EditText with username and password and then put the values. In the intent, use putextra function and start the next activity.
<br><br>
<img src="http://armorappz.com/github/passing-valu-img3.png">
</li>
<br><br>
<li>Step 4: Create a SecondActivity.class. In the second activity get the intent and store it in the string. So that the value can be passed to a text view. Declare all the activity in the manifest file. Then Run the project, the value would be passed from one activity to another.
<br><br>
<img src="http://armorappz.com/github/passing-valu-img4.png">
</li>


</ul>





</article>
