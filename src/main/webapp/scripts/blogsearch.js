function search(ele) {
	
	authorName ="http://" + ele.val() + ".blogspot.com";
	var request = $.post("getPageDetails", {
					url: authorName
	              },
	              function(data,status){
	            	   if (status == "success") {
	            	     displayPosts(data.posts);
	            	   }
	            	   else {
	            		   alert(status)
	            	   }
	              },
	              "json"
			);
			
}


function displayPosts(posts) {
	for (var i in posts) {
		alert(posts[i]);
	}
	
}