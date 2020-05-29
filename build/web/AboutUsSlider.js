            index=1;
            x=document.getElementsByClassName("images1");
            x[0].style.display="block";
            var interval=setInterval(slider,1000);
            
            function slider()
            {
                x=document.getElementsByClassName("images1");
                
                for(i=0 ; i < 3 ; i++)
                {
                    x[i].style.display="none";
                }
                
                if(index >= 3 )
                {
                    index=0;
                }
                x[index].style.display="block";
                index++;
            }
            
            
       