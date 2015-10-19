# IntentDemo
There is a simple demo to show how transfer data among three activities with Intent like;
Intent mIntent = new Intent(context,Activity3.class);
mIntent.setAction("Activity3.ShowImageActivity");
mIntent.putExtra("data",data);
mIntent.putExtra("folderName", folderName);
((Activity) context).startActivityForResult(mIntent,2);
