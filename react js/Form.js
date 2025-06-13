function Form() {
    return(
        <form>
            <div>
            <h1 align="center">Registration form </h1>
            <label> first name </label>
            <input type="text"/>
            <label>last name :</label>
            <input type="text"/><br/><br/>
            <label for="">email id :</label>
            <input type="email" name="" id="" autofocus/><br/><br/>
            <label for="">password| :</label>
            <input type="password" name="" id="" placeholder="password"/><br/><br/>
            <label for="">mobile no</label>
            <input type="tel" name="" id=""/><br/><br/>
            <label for="">Address: </label><br/>
            <textarea cols="50" rows="5" value="address"></textarea><br/><br/>
            <label for="">gender: </label>
            <input type="radio" name="h" id =""/>
            <label for="">male: </label>
            <input type="radio" name="h" id =""/>
            <label for="">female: </label>
            <input type="radio" name="h" id =""/>
            <label for="">other</label><br/><br/>
            
            <label>date of birth :</label>
            <input type="datetime-local" name="" id=""/><br/><br/>
            <h2>Personal Infromation</h2><br/>
            <label for="">SSC MARKS </label>
            <input type="text" name="" id=""/><br/><br/>
            <label for="">INTER/DEPLOMA Marks:</label>
            <input type="text" name="" id=""/><br/><br/>
            <label for="">B.Tech/DEGREE CGPA:</label>
            <input type="text" name="" id=""/><br/><br/>
            <label for="">upload resume: </label>
            <input type="file"/> <br/><br/>
            <input type="reset"/> <br/><br/>
            <input type="submit"/>
            <a href="sviet.html">submit</a>
            </div>
         </form>
    
    );
}
export default Form;