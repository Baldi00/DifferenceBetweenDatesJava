try {
    int dayInMillisec = 24 * 60 * 60 * 1000;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date firstDate = sdf.parse("2000-01-01");
    Date secondDate = sdf.parse("2000-12-31");
    secondDate.setTime(secondDate.getTime() + dayInMillisec-1); //To be more precise add 1day-1millisec (to have the entire last day)
    int diffInDays = (int)((secondDate.getTime() - firstDate.getTime())/dayInMillisec);
    System.out.println(diffInDays);
}catch(ParseException e){
    System.err.println("Incorrect date format");
}
