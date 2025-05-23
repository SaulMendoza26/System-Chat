


function yearsBirthday() {
    const selectYear = document.getElementById("year-birthday");

    const yearNow = new Date().getFullYear();
    const yearFirts = 1910;
    for (let year = yearNow; year >= yearFirts; year--) {
        const option = document.createElement("option");
        option.value = year;
        option.textContent = year;
        selectYear.appendChild(option);
    }
}
function monthsBirthday() {
    const selectMonth = document.getElementById("month-birthday");
    const months = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
    for (let i = 0; i < months.length; i++) {
        const option = document.createElement("option");
        option.value = i + 1;
        option.textContent = months[i];
        if(i==5){
            option.selected=months[i];
        }
       
        selectMonth.appendChild(option);
    }
}
function dayBirthday(){
    const selectDay = document.getElementById("day-birthday");
    for(let i =1; i<=31;i++){
        const option =document.createElement("option");
        option.value=i;
        option.textContent=i;
        selectDay.appendChild(option);

    }
}
const man = document.getElementById("hombre");
const woman= document.getElementById("mujer");
function getGenre(){
   
    man.value="HOMBRE";
    woman.value="MUJER";
    console.log({man:man, woman:woman})
}
dayBirthday();
monthsBirthday();
yearsBirthday();
getGenre();