Stoplight = function(colors) {
		var currentColor = 0;
		this.next = function() {			
			console.log(colors[currentColor]);									
			currentColor++;
			if (currentColor == colors.length) {
				currentColor = 0;
			}			
		}
}

Elevator = function(floor) {
		var currentFloor = 1;
		this.up = function() {																			
			if (currentFloor < floor) {
				currentFloor++;				
				console.log(currentFloor);	
			} else {
				console.log(currentFloor + " can't go up");
			}
		}
		this.down = function() {			
			if (currentFloor > 1) {
				currentFloor--;
				console.log(currentFloor);			
			} else {
				console.log(currentFloor + " can't go down");				
			}
		}
}
var elevator= new Elevator(3);